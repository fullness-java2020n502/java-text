package practice04;

/**
 * 演習4 カードクラス
 * @author imagepit
 */
public class Card {
	// フィールド
	String userName; // <-キャメルケース
	int point;
	// メソッド（引数あり）
	void addPoint(int addPoint) {
		// 引数で受け取った値をフィールドに加算
		point += addPoint;
	}
}
