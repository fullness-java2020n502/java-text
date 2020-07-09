package practice13;

public class Product {
	private int productNo;
	private String productName;
	private int unitPrice;
	// コンストラクタ
	public Product(int productNo,String productName) {
		this.productNo = productNo;
		this.productName = productName;
	}
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
	/**
	 * 販売単価を求めるメソッド
	 */
	public int getSalePrice() {
		return (int)(this.unitPrice * 0.5);
	}


	@Override
	public String toString() {
		return "Prodct["+ this.productName +"]";
	}
}
