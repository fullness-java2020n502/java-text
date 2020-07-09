package section1.practice08;
/**
 * 演習8 拡張for文を使った繰り返し
 * @author imagepit
 */
public class RepeatExtendForDriver {
	public static void main(String[] args) {
		String[] stations = {"品川","大崎","五反田","目黒","恵比寿","渋谷",
				"原宿","代々木","新宿"};
		// 拡張for文を使った繰り返し
		for(String station : stations) {
			System.out.println(station);
		}
	}
}
