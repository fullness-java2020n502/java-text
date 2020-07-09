package text;

/**
 * 配列を確認するためのクラス
 * @author imagepit
 */
public class ArraySample {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		// 配列の宣言と初期化
		int[] nums = {1,2,3,4,5,6};//要素数6として領域を確保
		// 格納した要素の値を取得
		System.out.println(nums[3]);//添え字4番目の4の値が出力される
		// 要素の代入
		nums[0] = 30;
		System.out.println(nums[0]);
		// 要素数の取得
		System.out.println(nums.length); // 6
	}

}
