package practice29;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {
        Set<Product> set = new HashSet<Product>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("商品番号[" + i + "]を入力してください");
            int no = scanner.nextInt();
            System.out.println("商品名[" + i + "]を入力してください");
            String name = scanner.next();
            System.out.println("価格[" + i + "]を入力してください");
            int price = scanner.nextInt();
            Product product = new Product();
            product.setNo(no);
            product.setName(name);
            product.setPrice(price);
            set.add(product);
        }

        for (Product product : set) {
            System.out.print("商品番号:" + product.getNo());
            System.out.print(" ");
            System.out.print("商品名:" + product.getName());
            System.out.print(" ");
            System.out.println("価格:" + product.getPrice());
        }

    }
}
