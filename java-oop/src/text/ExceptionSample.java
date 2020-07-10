package text;

public class ExceptionSample {
	// （可能性として）例外をスローする事を宣言
	void method() throws SameException {
		String[] strings = {"hoge","huga"};
		if(strings.length < 4) {
			// throw new IllegalArgumentException("配列要素数は4以上にしてください");
			// このメソッドはこの段階で終了
			throw new SameException("独自例外です");
		}
		strings[3] = "poyo"; // 例外発生
	}
}