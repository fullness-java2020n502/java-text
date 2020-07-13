package sample;

public class JDBCTestDriver {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("JDBCドライバ登録完了");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
