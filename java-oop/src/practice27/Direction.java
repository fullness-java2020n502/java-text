package practice27;

public enum Direction {
	NORTH("北"),// Directionの「コンストラクタ」を呼び出し、初期値を代入
	SOUTH("南"),
	EAST("東"),
	WEST("西");

	// この列挙型の型に値を内包したい場合にはコンストラクタ、フィールド、ゲッターを用意
	private String name;

	Direction(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
