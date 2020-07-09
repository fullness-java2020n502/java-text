package practice06;

import text.Car;

/**
 * 演習6 Taxクラスを呼び出すクラス
 * @author imagepit
 */
public class Driver {
	/**
	 * 実行起点メソッド
	 * @param args
	 */
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("金額1を入力してください");
//		int input1 = scanner.nextInt();
//		System.out.println("金額2を入力してください");
//		String input2 = scanner.next();
//		Tax tax = new Tax();
//		System.out.println("結果");
//		System.out.println("金額1の消費税額:" + tax.getTaxPrice(input1));
//		System.out.println("金額2の消費税額:" + tax.getTaxPrice(input2));
		Car car = new Car();
		System.out.println(car.name);
		System.out.println(car.color);
		System.out.println(car.speed);
		System.out.println(car.fuel);
		text.Track track = new text.Track();
		System.out.println(track.name);
		System.out.println(track.color);
		System.out.println(track.speed);
		System.out.println(track.fuel);
		System.out.println(track.tsumin);
	}
}
