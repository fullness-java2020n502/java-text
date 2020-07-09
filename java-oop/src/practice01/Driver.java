package practice01;

import java.util.Scanner;

/**
 * 呼び出す側（実行起点）クラス
 * @author imagepit
 */
public class Driver {
	/**
	 * 実行起点メソッド
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("社員番号を入力してください");
		int input1 = scanner.nextInt();
		System.out.println("社員名を入力してください");
		String input2 = scanner.next();
		// 社員クラスをインスタンス化
		Employee emp = new Employee();
		// フィールドに代入
		emp.empNo = input1;
		emp.empName = input2;
		// 出力
		System.out.println("結果");
		System.out.println("社員番号:" + emp.empNo);
		System.out.println("社員名:" + emp.empName);

	}
}
