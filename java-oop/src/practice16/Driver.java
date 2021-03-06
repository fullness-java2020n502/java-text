package practice16;

import java.util.Scanner;

/**
 * 口座クラスを呼び出すクラス
 * @author imagepit
 */
public class Driver {
	/**
	 * 実行起点メソッド
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("口座番号を入力");
		int input1 = scanner.nextInt();
		System.out.println("口座名義を入力");
		String input2 = scanner.next();
		System.out.println("残高を入力");
		int input3 = scanner.nextInt();
		// 子クラスをインスタンス化
		NetAccount netAccount = new NetAccount();
		// （子クラスだけど）親クラスのメソッドを呼び出す
		netAccount.setAccountNo(input1);
		netAccount.setAccountName(input2);
		netAccount.setBalance(input3);
		// 出力
		System.out.println("結果");
		netAccount.print();
	}
}
