package practice30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
        Map<Integer, Product> map = new HashMap<Integer, Product>();
        Product product1 = new Product();
        product1.setNo(101);
        product1.setName("ポテトチップス");
        product1. setPrice(150);
        map.put(product1.getNo(), product1);

        Product product2 = new Product();
        product2.setNo(102);
        product2.setName("オレンジジュース");
        product2.setPrice(120);
        map.put(product2.getNo(), product2);

        Product product3 = new Product();
        product3.setNo(103);
        product3.setName("バナナ");
        product3.setPrice(100);
        map.put(product3.getNo(), product3);

        Product product4 = new Product();
        product4.setNo(104);
        product4.setName("リンゴ");
        product4.setPrice(200);
        map.put(product4.getNo(), product4);
        Scanner scanner = new Scanner(System.in);
        System.out.println("商品番号を入力してください");
        int no = scanner.nextInt();
        Product product = map.get(no);
        if (product != null) {
            System.out.print("商品番号:" + product.getNo());
            System.out.print(" ");
            System.out.print("商品名:" + product.getName());
            System.out.print(" ");
            System.out.println("価格:" + product.getPrice());
        } else {
            System.out.println("対象の商品は存在しません");
        }
    }
}
