package text;

import java.sql.Date;
import java.sql.SQLException;

import practice08.ConnectionManager;

public class EmployeeDAODriver {
	public static void main(String[] args) throws SQLException{

		ConnectionManager connectionManager = new ConnectionManager();

		EmployeeDAO employeeDAO = new EmployeeDAO(connectionManager.getConnection());
		// レコード1件追加
		Employee employee1 = new Employee();
		employee1.setEmpNo(100);
		employee1.setEmpName("DAOさん");
		employee1.setBirthday(Date.valueOf("2000-01-01"));
		employee1.setDeptNo(2);
		int result = 0;
		try {
			result = employeeDAO.insert(employee1);
			connectionManager.commit();
			System.out.println("登録件数:" + result + "件");
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connectionManager.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}

		// 全件取得
		try {
			// ラムダ式で繰り返し処理
			employeeDAO.selectAll().forEach(emp -> System.out.println(emp));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// データベース接続解除
		connectionManager.closeConnection();

	}
}
