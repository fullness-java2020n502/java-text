package practice05;

import java.util.Scanner;

/**
 * 演習5 Productクラスを呼び出すクラス
 * @author imagepit
 */
public class Driver {
	/**
	 * 実行起点メソッド
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("商品名を入力");
		String input1 = scanner.next();
		System.out.println("単価を入力");
		int input2 = scanner.nextInt();
		// 初期化時にフィールドの値をセット
		Product product = new Product(input1,input2);
		System.out.println(product);
		//Product product = null; // インスタンス化してない
		//product.productName = input1;
		//product.unitPrice = input2;

		// 出力
		System.out.println("結果");
		System.out.println("商品名:"+ product.getProductName());
		System.out.println("単価:"+ product.getUnitPrice());
		int zeikomiKakaku = product.getSalePrice();
		System.out.println("税込価格:"+ zeikomiKakaku);

	}
}
