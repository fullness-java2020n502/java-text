package text;
/**
 * カプセル化パターン2
 * （不変な）（Imuutable）（インスタンスの定数化）
 * @author imagepit
 */
public class AccessorItem2 {
	// フィールド
	private int v1;
	// コンストラクタ（セッター的な）
	public AccessorItem2(int v1) {
		this.v1 = v1;
	}
	// ゲッター
	public int getV1() {
		return this.v1;
	}
}
