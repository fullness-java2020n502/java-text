package section1.practice05;

import java.util.Scanner;

/**
 * if-else-if-else
 * @author imagepit
 */
public class ConditionsIfElseIfDriver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("数値を入力してください");
		int input = scanner.nextInt();
		if(input == 0) {
			System.out.println("0です");
		} else if(input > 0) {
			System.out.println("正の値です");
		} else {
			System.out.println("負の値です");
		}
	}
}
