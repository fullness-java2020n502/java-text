package practice03;

public class Employee {
	// フィールド（オブジェクトの状態）<- 変数
	int empNo;
	String empName;
	// インスタンスメソッド（Objの振る舞い）<- 関数
	void print() { // 戻り値なし、名前はprint、引数もなし
		// コンソールに出力
		System.out.println("結果");
		System.out.println("社員番号:" + this.empNo);
		System.out.println("社員名:" + this.empName);
	}
}
