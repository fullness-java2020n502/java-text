package section1.practice07;

/**
 * 演習7 forを使った問題
 * @author imagepit
 *
 */
public class RepeatForDriver {
	public static void main(String[] args) {
		// 駅の配列を生成
		String[] stations = {"品川","大崎","五反田","目黒","恵比寿","渋谷",
				"原宿","代々木","新宿"};
		// for（カウンタを利用）で繰り返し
		for (int i = 0; i < stations.length; i++) {
			System.out.println(stations[i]);
		}
	}
}
