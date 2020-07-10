package practice20;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) { // <- ここではキャッチしないよ
        Scanner scanner = new Scanner(System.in);
        System.out.println("数字を入力してください。");
        int x = scanner.nextInt();
        int doubleResult = 0;
		try {
			doubleResult = toDouble(x);
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("0は不正です");
		}
        System.out.println("2倍した値:" + doubleResult);
        int squareResult = toSquare(x);
        System.out.println("2乗した値:" + squareResult);
    }

    /**
     * 検査例外（Exception派生クラス）を使って例外送出メソッド
     * @param x
     * @return
     */
    public static int toDouble(int x) throws Exception{
    	if(x == 0) throw new Exception("x=0"); // <- ここでこのメソッドは終了（早期退出）
        return x * 2;
    }
    /**
     * 非検査例外（RuntimeException派生クラス）を使って例外送出するメソッド
     * @param x
     * @return
     */
    public static int toSquare(int x) throws RuntimeException{
    	if(x == 0) throw new RuntimeException("x=0");
        return x * x;
    }
}

