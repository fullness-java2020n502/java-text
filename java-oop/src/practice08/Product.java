package practice08;
/**
 * 演習8 社員クラス
 * @author imagepit
 */
public class Product {
	// フィールド
	int productNo;
	String productName;
	int unitPrice;
	int stock;
	// コンストラクタ
	// 1つの引数
	public Product(int pProductNo) {
		this.productNo = pProductNo;
	}
	// 2つの引数
	public Product(int pProductNo,String pProductName) {
		this.productNo = pProductNo;
		this.productName = pProductName;
	}
	// 3つの引数
	public Product(int pProductNo,String pProductName, int pUnitPrice) {
		this.productNo = pProductNo;
		this.productName = pProductName;
		this.unitPrice = pUnitPrice;
	}
}
