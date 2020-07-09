package text;

public class Car {
	// フィールド
	public String name;
	public String color;
	public int speed;
	public int fuel;

	// コンストラクタ（インスタンス化の初期化処理）
	public Car(
			String name,
			String color,
			int speed,
			int fuel
	) {
		// フィールドの値を初期化
		this.name = name;
		this.color = color;
		this.speed = speed;
		this.fuel = fuel;
	}

	// 引数なしのコンストラクタ
	public Car() {
		this.name = "名無しの権瓶";
		this.color = "白";
		this.speed = 10;
		this.fuel = 100;
	}

	// メソッド
	// クラスが持っているフィールドを処理させる
	public int run() {
		fuel--;
		return speed;
	}
	void speedUp(int up) {
		speed += up;
	}
}
