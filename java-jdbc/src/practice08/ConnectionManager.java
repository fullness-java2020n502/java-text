package practice08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * コネクションマネジャークラス<br>
 * - JDBCドライバの登録<br>
 * - データベース接続（Connectionのインスタンス化）<br>
 * - トランザクション処理<br>
 * 	   - コミット<br>
 *     - ロールバック<br>
 * - データベースの接続解除<br>
 * @author imagepit<br>
 */
public class ConnectionManager {

	private Connection connection = null;
	private static final String DRIVER_NAME_STRING = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/jdbc";
	private static final String USER = "jdbc";
	private static final String PASSWORD = "jdbc";

	// STEP1 JDBCドライバの登録
	// JVMロード時に一回インスタンス化されればよいということなので
	// スタティックイニシャライザで処理
	static{
		try {
			Class.forName(DRIVER_NAME_STRING);
			System.out.println("JDBCドライバ登録成功");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("JDBCドライバ登録失敗");
		}
	}

	// STEP2 データベース接続
	public Connection getConnection() throws SQLException {
		connection = DriverManager.getConnection(URL,USER,PASSWORD);
		connection.setAutoCommit(false); // 手動コミットモード有効
		System.out.println("データベース接続成功");
		return connection;
	}

	// STEP6 データベース接続解除
	public void closeConnection() throws SQLException{
		if(connection != null && !connection.isClosed()) connection.close();
		System.out.println("データベース接続解除成功");
	}

	public void commit() throws SQLException{
		if(connection != null && !connection.isClosed()) connection.commit();
		System.out.println("コミット成功");
	}

	public void rollback() throws SQLException{
		if(connection != null && !connection.isClosed()) connection.rollback();
		System.out.println("ロールバック成功");
	}



}
