package practice04;

import java.util.Scanner;

/**
 * 演習4 Cardクラスを呼び出すクラス
 * @author imagepit
 */
public class Driver {
	/**
	 * 実行起点メソッド
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("カード所有者を入力");
		String input = scanner.next();
		// Cardクラスをインスタンス化
		Card card = new Card();
		System.out.println("現在のポイント:" + card.point);
		System.out.println("追加ポイントを入力");
		int addPoint = scanner.nextInt();
		card.addPoint(addPoint); // 引数ありメソッド呼び出し
		System.out.println("追加ポイントを入力");
		int addPoint2 = scanner.nextInt();
		card.addPoint(addPoint2); // 引数ありメソッド呼び出し

		System.out.println("現在のポイント:" + card.point);
	}
}
