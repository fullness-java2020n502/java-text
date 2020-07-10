package text;

import java.util.Scanner;

import practice01.Employee;

public class CircleDriver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ユーザ名を入力");
		String usernameString = scanner.next();
		System.out.println("パスワードを入力");
		String passwordString = scanner.next();

		// ポリモーフィズムはインターフェース型もしくは抽象クラスの型の変数（引数）を宣言して
		// その変数の中に具象クラスを代入する事ができる
		Authenticate authenticate = new AuthenticateGoogle(); // <- ここだけなおせばいい

		Employee employee = authenticate.authenticate(usernameString, passwordString);

		System.out.println("ログインできました:ユーザ名:" + employee.empName);

		// インターフェース型を実装したクラスはプラッガブル（着脱可能）になる
		//EmployeeRepository repository = new EmployeeRepositoryMySQL();
		// インスタンス化後の呼び出し方を変更する必要がなくなる
		//repository.insert(new Employee());

		//throw new ArithmeticException("devision by zero");
		//Circle circle = new Circle();
		//System.out.println(Circle.PI);
		//System.out.println(Circle.PI);
		//System.out.println(Circle.calc(10));
	}
}
