package text;

/**
 * 呼ばれる（利用される）側のクラス
 * @author imagepit
 */
public class Triangle {
	/**
	 * 三角形の面積を求める
	 * @param teihen 底辺
	 * @param takasa 高さ
	 * @return 面積
	 */
	public double calcArea(double teihen, double takasa) {

		int result = sum(1,2,3,4,5,6,7);
		return teihen * takasa / 2;
		//System.out.println(result);

	}

	/**
	 * 可変長引数のメソッド
	 */
	public int sum(int... nums) {
		int sum = 0;
		for(int value: nums) {
			sum += value;
		}
		return sum;
	}
}
