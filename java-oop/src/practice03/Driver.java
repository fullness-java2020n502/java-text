package practice03;
import java.util.Scanner;
/**
 * Employeeクラスを呼び出す側のクラス
 * @author imagepit
 */
public class Driver {
	/**
	 * 実行起点メソッド
	 * @param args
	 */
	public static void main(String[] args) {
		// コンソールから値を取得
		Scanner scanner = new Scanner(System.in);
		// System.inは「標準入力」のオブジェクト
		System.out.println("社員番号を入力");
		int input1 = scanner.nextInt();
		System.out.println("社員名を入力");
		String input2 = scanner.next();
		// インスタンス化
		Employee employee = new Employee();
		// フィールド値を代入
		employee.empNo = input1;
		employee.empName = input2;
		// 出力（今回はEmployee側の責務で出力）
		employee.print(); // <- インスタンスメソッド呼び出し
	}

}
