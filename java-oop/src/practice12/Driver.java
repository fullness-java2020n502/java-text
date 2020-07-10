package practice12;

import java.util.Scanner;

/**
 * 演習12 商品クラスを呼び出すクラス
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
		Product product = new Product();
		// セッターを呼び出す
		product.setProductNo(input1);
		product.setProductName(input2);
		product.setUnitPrice(input3);
		// 出力
		// ゲッターを呼び出す
		System.out.println("結果");
		System.out.println("商品番号:"+product.getProductNo());
		System.out.println("商品名:"+product.getProductName());
		System.out.println("単価:"+product.getUnitPrice());
	}
}