package practice10;
/**
 * 演習10 税クラス
 * @author imagepit
 */
public class Tax {
	// スタティックフィールド
	static double rate = 0.05;
	// スタティックメソッド
	static int getTaxPrice(int price) {
		return (int)(price * rate);
	}
}
