package practice04;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDriver {
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

		// 1.JDBCドライバの登録
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("JDBCドライバ失敗",e);
		}

		// 2.DBの接続
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc","jdbc","jdbc");
			System.out.println("DB接続成功");
			// 3.SQLのステートメントの生成（PreparedStatementを利用）
			preparedStatement = connection.prepareStatement(
					"update employee set emp_name = ?, birthday = ?, dept_no = ? where emp_no = ?"
			);
			// 3.1 バインド変数をセット
			preparedStatement.setString(1, input2);
			preparedStatement.setDate(2, Date.valueOf(input3));
			preparedStatement.setInt(3, input4);
			preparedStatement.setInt(4, input1);
			// 4.SQLの実行
			int result = preparedStatement.executeUpdate(); // 更新したレコード数を戻り値を返す
			System.out.println("登録結果:" + result + "件");
		} catch (SQLException e) {
			throw new RuntimeException("DB関連エラー",e);
		} finally {
			// 5.DBとステートメントの接続解除
			try {
				// DB接続の解除
				if(connection != null && !connection.isClosed()) {
					connection.close();
					System.out.println("DB接続解除成功");
				}
				// ステートメントの解除
				if(preparedStatement != null) {
					preparedStatement.close();
					System.out.println("ステートメント解除の成功");
				}
			} catch (SQLException e2) {
				throw new RuntimeException("DB接続、ステートメント解除の失敗");
			}
		}



	}
}

