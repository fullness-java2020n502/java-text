package practice09;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import practice08.ConnectionManager;

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
		Connection connection = null;
		PreparedStatement statement = null;
		try {
			connection = connectionManager.getConnection();
			// STEP3 ステートメントの生成
			statement = connection.prepareStatement("insert into employee values(?,?,?,?)");
			statement.setInt(1, input1);
			statement.setString(2, input2);
			statement.setDate(3, Date.valueOf(input3));
			statement.setInt(4, input1);
			// STEP4 SQL実行
			int result = statement.executeUpdate();
			// コミット
			connection.commit();
			System.out.println("登録件数:" + result + "件");
		} catch (SQLException e) {
			System.out.println("DB関連エラー");
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println("ロールバック失敗");
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("DB接続解除失敗");
				e.printStackTrace();
			}
		}
	}
}
