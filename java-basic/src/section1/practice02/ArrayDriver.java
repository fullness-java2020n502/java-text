package section1.practice02;

import java.util.Scanner;

public class ArrayDriver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("数値1を入力してください");
		int input1 = scanner.nextInt();
		System.out.println("数値2を入力してください");
		int input2 = scanner.nextInt();
		System.out.println("数値3を入力してください");
		int input3 = scanner.nextInt();
		// 配列に値を代入
		int[] numbers = {input1,input2,input3};
		//int[] numbers = new int[3];
		//numbers[0] = input1;
		//numbers[1] = input2;
		//numbers[2] = input3;
		System.out.println("入力結果（変更前）");
		System.out.println("数値1:" + numbers[0]);
		System.out.println("数値2:" + numbers[1]);
		System.out.println("数値3:" + numbers[2]);
		System.out.println("入力結果（変更後）");
		System.out.println("数値1:" + numbers[0]);
		System.out.println("数値2:" + numbers[1]*10);
		System.out.println("数値3:" + numbers[2]);
	}
}
