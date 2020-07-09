package section1.practice06;

import java.util.Scanner;

/**
 * switch-case
 * @author imagepit
 */
public class ConditionSwitchDriver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("数値を入力してください");
		int input = scanner.nextInt();
		switch(input % 3) {
		case 0:
			System.out.println("3で割り切れます");
			break;
		case 1:
			System.out.println("3で割った剰余は1です");
			break;
		case 2:
			System.out.println("3で割った剰余は2です");
			break;
		default:
			break;
		}
	}
}
