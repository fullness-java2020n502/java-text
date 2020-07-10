package practice22;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("割られる数を入力してください。");
        int x = scanner.nextInt();
        System.out.println("割る数を入力してください。");
        int y = scanner.nextInt();
        int result = 0;
        try {
            result = Calculator.divide(x, y); // 例外が発生しうるメソッド
        } catch (IllegalInputException e) {
            // e.printStackTrace();
            System.out.println("不正な数が入力されました");
            return;
        }
        System.out.println("結果:" + result);
    }
}
