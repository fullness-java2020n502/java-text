package practice08;

import java.util.Scanner;

/**
 * 商品クラスを呼び出すクラス
 * @author imagepit
 */
public class Driver {
	/**
	 * 実行起点
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("商品番号1を入力");
		int product1No = scanner.nextInt();
		System.out.println("商品名1を入力");
		String product1Name = scanner.next();
		System.out.println("単価1を入力");
		int product1Price = scanner.nextInt();
		System.out.println("在庫数1を入力");
		int product1Stock = scanner.nextInt();
		System.out.println("商品番号2を入力");
		int product2No = scanner.nextInt();
		System.out.println("商品名2を入力");
		String product2Name = scanner.next();
		System.out.println("単価2を入力");
		int product2Price = scanner.nextInt();
		System.out.println("在庫数2を入力");
		int product2Stock = scanner.nextInt();
		System.out.println("商品番号3を入力");
		int product3No = scanner.nextInt();
		System.out.println("商品名3を入力");
		String product3Name = scanner.next();
		System.out.println("単価3を入力");
		int product3Price = scanner.nextInt();
		System.out.println("在庫数3を入力");
		int product3Stock = scanner.nextInt();

		Product product1 = new Product(product1No);
		product1.productName = product1Name;
		product1.unitPrice = product1Price;
		product1.stock = product1Stock;

		Product product2 = new Product(product2No,product2Name);
		product2.unitPrice = product2Price;
		product2.stock = product2Stock;

		Product product3 = new Product(product3No,product3Name,product3Price);
		product3.stock = product3Stock;

		Product[] products = {product1,product2,product3};
		System.out.println("結果");
		for (int i = 0; i < products.length; i++) {
			System.out.println("商品番号"+ (i+1) +":" + products[i].productNo);
			System.out.println("商品名"+ (i+1) +":" + products[i].productName);
			System.out.println("単価"+ (i+1) +":" + products[i].unitPrice);
			System.out.println("在庫数"+ (i+1) +":" + products[i].stock);
			Product product = products[i];
		}

	}
}
