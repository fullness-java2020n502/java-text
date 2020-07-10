package practice21;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("口座番号を入力");
		int input1 = scanner.nextInt();
		System.out.println("貯金額を入力");
		int input2 = scanner.nextInt();
		Account account = new Account(input1);
		// 貯金額を入れる場所で例外処理（キャッチ）
		try {
			account.addBalence(input2);
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println(e.getCause());
			//System.out.println("不正な貯金額が入力されました");
			return; // 早期退出
		}
		System.out.println("結果");
		System.out.println("口座番号:" + account.getAccountNo());
		System.out.println("結果:" + account.getBalance());
	}
}
