package practice27;
import java.util.Scanner;
/**
 * 演習27 列挙型の演習（利用する側）
 * @author imagepit
 */
public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("猫、犬の何れかを入力してください。");
        String input = scanner.next();
        Animal animal = AnimalType.valueOf(input).getAnimal(); // 文字列から列挙型の定数を取得
        System.out.println("鳴き声:" + animal.cray());
	}
}
