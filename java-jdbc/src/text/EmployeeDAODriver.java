package text;

import java.sql.Date;
import java.sql.SQLException;

import practice08.ConnectionManager;
/**
 * DAOを呼び出す側のクラス（通常はServiceクラスですけど）
 * @author imagepit
 *
 */
public class EmployeeDAODriver {
	public static void main(String[] args) throws Exception{

		ConnectionManager connectionManager = new ConnectionManager();
		EmployeeDAO employeeDAO = new EmployeeDAO(connectionManager.getConnection());

		// レコード1件のValueクラスを生成
		Employee employee1 = new Employee();
		employee1.setEmpNo(201);
		employee1.setEmpName("DAOさん");
		employee1.setBirthday(Date.valueOf("2000-01-01"));
		employee1.setDeptNo(2);

		try {
			System.out.println("登録件数:" + employeeDAO.insert(employee1) + "件");
			connectionManager.commit(); // コミット
		} catch (SQLException e) {
			try {
				connectionManager.rollback();
			} catch (SQLException e1) {
				throw new RuntimeException(""); // 独自例外クラスを作ってスローしてもよい
			}
			// 通常はコントローラー側が例外をキャッチしてエラー画面だすなど制御するので
			// Serviceクラスなら例外をラップして送出する
			// Servlet(Tomcat)は全体で例外をキャッチするクラスを作れます
			throw new RuntimeException(""); // 独自例外クラスを作ってスローしてもよい
		}

		// 全件取得
		try {
			// ラムダ式（関数プログラミング）で繰り返し処理
			employeeDAO.selectAll().forEach(emp -> System.out.println(emp));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// データベース接続解除
		connectionManager.closeConnection();

	}
}
