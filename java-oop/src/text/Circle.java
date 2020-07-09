package text;

public class Circle {
	// スタティックイニシャライザ
	static {
		System.out.println("初期化");
		PI = 4;
	}
	// スタティックフィールド
	static final double PI;
	// インスタンスフィールド
	double sameNumber;

	// スタティックメソッド
	static double calc(int r) {
		return r * r * PI;
	}
}
