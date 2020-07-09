package practice12;
/**
 * 演習12 商品クラス
 * @author imagepit
 */
public class Product { // 先頭は大文字
	// カプセル化は
	// フィールドを隠蔽（private）する
	private int productNo;
	private String productName;
	private int unitPrice;
	// ゲッターセッター
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
}
