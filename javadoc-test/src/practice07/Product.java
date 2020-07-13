package practice07;

/**
 * 商品クラス
 * @author imagepit
 */
public class Product {
	/** 商品番号 */
	private int no;
	/** 商品名 */
	private String name;
	/** 単価 */
	private int price;
	/**
	 * コンストラクタ（商品番号、商品名を初期化）
	 * @param no 商品番号
	 * @param name 商品名
	 */
	public Product(int no, String name) {
		this.no = no;
		this.name = name;
	}
	/**
	 * 商品番号を取得（ゲッター）
	 * @return 商品番号
	 */
	public int getNo() {
		return no;
	}
	/**
	 * 商品名を取得（ゲッター）
	 * @return 商品名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 単価を取得（ゲッター）
	 * @return 単価
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * 単価を更新（セッター）
	 * @param price 単価
	 */
	public void setPrice(int price) {
		this.price = price;
	}

}
