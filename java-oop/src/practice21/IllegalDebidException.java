package practice21;

/**
 * 独自例外クラス
 * @author imagepit
 */
public class IllegalDebidException extends Exception{
	public IllegalDebidException() {
		super();
	}
	public IllegalDebidException(String message, Throwable e) {
		super(message,e);
	}
	public IllegalDebidException(String message) {
		super(message);
	}
	@Override
	public synchronized Throwable getCause() {
		return new Throwable("エラー原因");
	}
}
