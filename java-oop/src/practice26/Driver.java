package practice26;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("走らせたいものを入力してください");
		System.out.println("1:人 2:車");
		int input1 = scanner.nextInt();
		// インターフェース型の変数を用意
		Runner runner = null;
		if(input1 == 1) {
			runner = new Human(); // 実装クラスを代入
		} else if(input1 == 2) {
			runner = new Car(); // 実装クラスを代入
		}
		run(runner); // 実行
	}

	// 引数にもインターフェース型を指定できる
	public static void run(Runner runner) {
		runner.run();
	}
}
