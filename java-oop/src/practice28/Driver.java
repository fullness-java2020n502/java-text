package practice28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 演習28 商品クラスを呼び出すクラス
 * @author imagepit
 */
public class Driver {

	public static final int ROOP_COUNT = 3; // マジックナンバーを定数化

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < ROOP_COUNT; i++) { // マジックナンバー（よくない）
			System.out.println("商品番号" + (i+1) + "を入力");
			int no = scanner.nextInt();
			System.out.println("商品名:" + (i+1) + "を入力");
			String name = scanner.next();
			System.out.println("価格:" + (i+1) + "を入力");
			int price = scanner.nextInt();
			Product p = new Product();
			p.setNo(no);
			p.setName(name);
			p.setPrice(price);
			// ArrayListに要素を追加
			products.add(p);
		}
		for (int i = 0; i < products.size(); i++) {
			Product product = products.get(i);
			System.out.println("商品番号" + (i+1) + ":" + product.getNo());
			System.out.println("商品名:" + (i+1) + ":" + product.getName());
			System.out.println("価格:" + (i+1) + ":" + product.getPrice());
		}
	}
}
