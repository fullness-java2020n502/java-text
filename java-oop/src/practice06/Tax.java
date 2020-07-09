package practice06;
/**
 * 演習6 Taxクラス
 * @author imagepit
 */
public class Tax {
	double rate = 0.05;
	/**
	 * 消費税取得メソッド
	 * @param price 金額
	 * @return 消費税
	 */
	int getTaxPrice(int price) {
		return (int)(price * rate);
	}
	/**
	 * 消費税取得メソッド（引数が文字列の場合）
	 * @param price
	 * @return
	 */
	int getTaxPrice(String price) {
		// Integer.parseInt(数字の文字列)
			// 文字から整数に変換する
		return (int)(Integer.parseInt(price) * rate);
	}
}
