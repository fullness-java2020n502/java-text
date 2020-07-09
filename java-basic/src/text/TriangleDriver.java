package text;

/**
 * Triangleクラスを呼び出す（利用する）側のクラス
 * @author imagepit
 */
public class TriangleDriver {
	/**
	 * 実行する起点のメソッド
	 */
	public static void main(String[] args) {
		// クラスを呼び出してインスタンス化（実態化）
		Triangle triangle = new Triangle();
		double result = triangle.calcArea(3, 3); // 25
		int result2 = triangle.sum(1,2,3,4,5,6,7);
		System.out.println(result);
		System.out.println(result2);
	}
}
