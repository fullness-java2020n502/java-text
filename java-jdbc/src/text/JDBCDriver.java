package text;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCDriver {
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
		Connection connection = null; // 以降のSTEPで使うからスコープを外にしている
		// connection変数が以降のSQLステートメントの生成やSQL実行、DB接続解除を行う
		Statement statement = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DriverManager.getConnection(
					// jdbc:postgresql://[ホスト名]:[ポート番号]/[DB名]
					"jdbc:postgresql://localhost:5432/jdbc", // URL
					"jdbc", // ユーザ名
					"jdbc" // パスワード
					);
			System.out.println("DB接続成功");
			// STEP3 SQLステートメントの生成
			// Statementの生成（動的に変更しないSQL文を生成する場合）
			String sql = "insert into department values(3,'テスト部')";
			statement = connection.createStatement();
			statement.executeUpdate(sql); // <- Statementの場合はここの引数にSQL文字列をセット
			// PreparedStatementの生成（動的に変更したいSQL文を生成する場合）
			// SQLインジェクション対策にもなっている
			String sql2 = "insert into department values(?,?)";
			preparedStatement = connection.prepareStatement(sql2);
			// バインド変数の箇所の値をセット
			preparedStatement.setInt(1, 4); // 1番目の?に4の値をセット
			preparedStatement.setString(2, "テスト2部");// 2番目の?に"テスト2部"をセット
			// STEP4 SQLの実行（更新系(INSERT,UPDATE,DELETE)はここで完了）
			preparedStatement.executeUpdate(); // <- 引数なし
			// TODO STEP5 SQLの実行結果の取得（主に参照系(SELECT)で）
		} catch (SQLException e) {
			throw new RuntimeException("DB関連のエラー",e);
		} finally {
			// STEP6 DB接続の解除
			try {
				// ステートメントの解除
				if(statement != null) statement.close();
				if(preparedStatement != null) preparedStatement.close();
				
				if(connection != null && !connection.isClosed()) {
					connection.close();
					System.out.println("DB接続、ステートメント解除成功");
				}
			} catch (SQLException e) {
				throw new RuntimeException("DB接続、ステートメント解除失敗");
			}
		}






	}
}
