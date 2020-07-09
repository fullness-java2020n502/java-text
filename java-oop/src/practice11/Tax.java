package practice11;

/**
 * 演習11 税クラス
 * @author imagepit
 */
public class Tax {
	// スタティックフィールド
	static double rate; //1
	// スタティックイニシャライザ
	static {
		rate = 0.08; // 2
	}
	// スタティックメソッド
	static int getTaxPrice(int price) {
		return (int)(price * rate);
	}
}
