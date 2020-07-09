package practice19;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("割られる数を入力");
		int input1 = scanner.nextInt();
		System.out.println("割る数を入力");
		int input2 = scanner.nextInt();
		if(input2 == 0) {
			System.out.println("割る数は0じゃだめです");
			return; // 早期退出
		}
		int result = input1 / input2;
		System.out.println("結果:" + result);
//		try {
//			int result = input1 / input2; // input2が0のときは例外発生
//			// 例外発生時は例外は別のスレッド（プログラムの流れ）になる
//			System.out.println("結果:" + result);
//		} catch (ArithmeticException e) {
//			// 別スレッドで例外発生の内容をキャッチするので
//			// タイミング的にはfinallyの処理より後だったり、前だったりする
//			System.out.println("例外が発生しました");
//			e.printStackTrace(); // コンソールに例外内容を出力
//		} finally {
//			System.out.println("処理終了");
//		}
	}
}
