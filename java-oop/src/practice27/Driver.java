package practice27;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("EAST、WEST、SOUTH、NORTHの何れかを入力してください。");
        String input = scanner.next();
        Direction direction = Direction.valueOf(input);
        System.out.println(direction.getName() + "が指定されました。");
	}
}
