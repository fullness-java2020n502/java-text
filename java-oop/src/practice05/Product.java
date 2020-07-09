package practice05;

/**
 * 演習5 商品クラス
 * @author imagepit
 */
public class Product {
	// フィールド
	private String productName;
	private int unitPrice; // フィールドを書き換える処理（副作用）
	private double rate = 0.20;

	// コンストラクタ（初期化）
	public Product(String productName,int unitPrice) {
		this.productName = productName;
		if(unitPrice < 0) throw new IllegalArgumentException("単価は正の数にしてください");
		this.unitPrice = unitPrice;
	}

	// ゲッター
	public String getProductName() {
		return this.productName;
	}

	public int getUnitPrice() {
		return this.unitPrice;
	}


	// メソッド
	int getSalePrice() {
		// 戻り値はintなので
		// double->intに明示的にキャストする必要あり
		return unitPrice + (int)(unitPrice * rate);
	}
}
