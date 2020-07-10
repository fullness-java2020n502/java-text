package text;

/**
 * 独自例外クラス
 * @author imagepit
 */
public class SameException extends Exception{
	// キャッチした場合にメッセージなどを送りたい場合は
	// 親クラスのコンストラクタを再定義する
	public SameException(String message) {
		super(message); // 親クラスのコンストラクタを呼び出す
		// そうするとcatchしたときにgetMessageで取得できる
	}
	// Throwableを引数にすると
	// （後述）例外をラップしてさらに呼び出し元に例外を投げるときに
	// その経緯をより詳細にprintStackTraceに出力できる
	public SameException(String message, Throwable e) {
		super(message,e);
	}
}
