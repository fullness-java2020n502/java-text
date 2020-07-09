package text;
/**
 * カプセル化のサンプルクラス
 * @author imagepit
 */
public class AccessorItem1 {
	// フィールド
	private int v1;
	// ゲッター
	public int getV1() {
		return v1;
	}
	// セッター
	public void setV1(int v1) {
		// ビジネスルールを適用
		if(v1 < 0) System.out.print("エラー");
		this.v1 = v1;
	}
}
