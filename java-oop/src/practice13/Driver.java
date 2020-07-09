package practice13;

import java.util.Scanner;

/**
 * 商品13 商品クラスを呼び出すクラス
 * @author imagepit
 */
public class Driver {
	/**
	 * 実行起点メソッド
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("商品番号を入力");
		int input1 = scanner.nextInt();
		System.out.println("商品名を入力");
		String input2 = scanner.next();
		System.out.println("単価を入力");
		int input3 = scanner.nextInt();
		// インスタンス化
		Product product = new Product(input1, input2);
		System.out.println(product);
		// セッター呼び出し
		product.setUnitPrice(input3);
		// 出力
		System.out.println("結果");
		System.out.println("商品番号:" + product.getProductNo());
		System.out.println("商品名:" + product.getProductName());
		System.out.println("単価:" + product.getUnitPrice());
		System.out.println("販売価格:" + product.getSalePrice());
	}
}
