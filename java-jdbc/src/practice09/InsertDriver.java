package practice09;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

import practice08.ConnectionManager;
import text.Employee;
import text.EmployeeDAO;

public class InsertDriver {
	public static void main(String[] args) {
		// コンソールから入力値を取得
		Scanner scanner = new Scanner(System.in);
		System.out.println("社員番号を入力");
		int input1 = scanner.nextInt();
		System.out.println("社員名を入力");
		String input2 = scanner.next();
		System.out.println("生年月日を入力");
		String input3 = scanner.next();
		System.out.println("部署番号を入力");
		int input4 = scanner.nextInt();

		ConnectionManager connectionManager = new ConnectionManager();

		// DAOを呼び出す
		try {
			// コンストラクタでコネクションを引数としてセットしている理由
				// 1. テストしやすくなる（テスト用のコネクションを使ってテストがしやすい）
				// 2. 複数のDAO（テーブル）を使った場合のトランザクション処理の場合に
					// まとめてコミット、ロールバックしやすくできる
			EmployeeDAO employeeDAO = new EmployeeDAO(connectionManager.getConnection());

			Employee employee = new Employee();
			employee.setEmpNo(input1);
			employee.setEmpName(input2);
			employee.setBirthday(Date.valueOf(input3));
			employee.setDeptNo(input4);

			employeeDAO.insert(employee);
			employeeDAO.insert(employee);
			employeeDAO.insert(employee);
			connectionManager.commit();
		} catch (SQLException e) {
			try {
				connectionManager.rollback();
			} catch (SQLException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}
			// DB関連のエラー
			e.printStackTrace();
		}


//		Connection connection = null;
//		PreparedStatement statement = null;
//		try {
//			connection = connectionManager.getConnection();
//			// STEP3 ステートメントの生成
//			statement = connection.prepareStatement("insert into employee values(?,?,?,?)");
//			statement.setInt(1, input1);
//			statement.setString(2, input2);
//			statement.setDate(3, Date.valueOf(input3));
//			statement.setInt(4, input1);
//			// STEP4 SQL実行
//			int result = statement.executeUpdate();
//			// コミット
//			connection.commit();
//			System.out.println("登録件数:" + result + "件");
//		} catch (SQLException e) {
//			System.out.println("DB関連エラー");
//			try {
//				connection.rollback();
//			} catch (SQLException e1) {
//				System.out.println("ロールバック失敗");
//				e1.printStackTrace();
//			}
//			e.printStackTrace();
//		} finally {
//			try {
//				connection.close();
//			} catch (SQLException e) {
//				System.out.println("DB接続解除失敗");
//				e.printStackTrace();
//			}
//		}
	}
}
