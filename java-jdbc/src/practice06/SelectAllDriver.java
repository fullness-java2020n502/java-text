package practice06;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectAllDriver {
	public static void main(String[] args) {
		// STEP1 JDBCドライバの登録
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("JDBCドライバ登録成功");
		} catch (ClassNotFoundException e) {
			// ここで例外が起きたら以降の処理はできないので実行エラーとしてラップ
			throw new RuntimeException("JDBCドライバ登録の失敗");
		}

		// STEP2 DBの接続
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = DriverManager.getConnection(
					// jdbc:postgresql://[ホスト名]:[ポート番号]/[DB名]
					"jdbc:postgresql://localhost:5432/jdbc", // URL
					"jdbc", // ユーザ名
					"jdbc" // パスワード
			);
			System.out.println("DB接続成功");

			// STEP3 SQLステートメントの生成
			String sql = "select * from employee";
			preparedStatement = connection.prepareStatement(sql);

			// STEP4 SQLの実行
			resultSet = preparedStatement.executeQuery();
			// STEP5 SQLの実行結果の取得（主に参照系(SELECT)で）
			while(resultSet.next()) {
				int empNo = resultSet.getInt("emp_no"); // <- 引数はカラム名
				String empName = resultSet.getString("emp_name"); // <- 引数はカラム名
				Date birthday = resultSet.getDate("birthday"); // <- 引数はカラム名
				int dptNo = resultSet.getInt("dept_no"); // <- 引数はカラム名
				System.out.println("====================");
				System.out.println("社員番号:" + empNo);
				System.out.println("社員名:" + empName);
				System.out.println("生年月日:" + birthday);
				System.out.println("部署番号:" + dptNo);
			}
		} catch (SQLException e) {
			throw new RuntimeException("DB関連のエラー",e);
		} finally {
			// STEP6 DB接続の解除
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null && !connection.isClosed()) connection.close();
				System.out.println("ステートメントの開放に成功しました");
				System.out.println("データベース接続の開放に成功しました");
			} catch (SQLException e) {
				throw new RuntimeException("DB接続、ステートメント解除失敗");
			}
		}
	}
}
