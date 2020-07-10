package practice25;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("プレイヤーを入力してください");
		System.out.println("1:CD 2:DVD");
		int input1 = scanner.nextInt();
		// 親クラス（抽象クラス）の変数を用意
		AbstractPlayer player = null;
		if(input1 == 1) {
			player = new CDPlayer();
		}else if(input1 == 2) {
			player = new DVDPlayer();
		}
		System.out.println("タイトルを入力してください");
		String input2 = scanner.next();
		player.setMediaName(input2);
		player.play();
	}
}
