package section1.practice04;
import java.util.Scanner;
/**
 * 演習4 if-else
 * @author imagepit
 */
public class ConditionIfElseDriver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("数値を入力してください");
		int input = scanner.nextInt();
		if(input % 4 == 0) {
			System.out.println("4の倍数です");
		} else {
			System.out.println("4の倍数ではありません");
		}
	}
}
