package section1.practice10;

import java.util.Scanner;

/**
 * 演習10 breakを使った繰り返し処理の途中終了
 * @author imagepit
 */
public class RepeatBreakDriver {
	public static void main(String[] args) {
		// 駅名
		String[] stations = {"品川","大崎","五反田","目黒","恵比寿","渋谷",
				"原宿","代々木","新宿"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("駅名を入力してください");
		// 文字列をコンソールから取得
		String input = scanner.next(); // <-文字列の場合のメソッド
		int i = 0;
		for (; i < stations.length; i++) {
			if(stations[i].equals(input)) {
				break;
			}
		}
		if(i == stations.length) {
			System.out.println("そのような駅は存在しません");
		} else {
			System.out.println((i+1)+ "番目の駅です");
		}
	}
}
