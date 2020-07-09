package text;

public class ExceptionCatch {
	public static void main(String[] args) {
		ExceptionSample sample = new ExceptionSample();
//		sample.method();
//		try(Scanner scanner = new Scanner(System.in)){
//			System.out.println("数値を入力");
//			int input = scanner.nextInt();
//			// scanner.close(); 今回は書く必要なし
//		} catch (Exception e) {
//			System.out.println("数値以外はだめ!");
//			//e.printStackTrace();
//		}
		try {
			sample.method();
			System.out.println("例外発生しなかった");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列要素数がおかしいです");
		} catch (SameException e) {
			e.printStackTrace();
		}
	}
}
