package practice23;

/**
 * 抽象クラス（is-aの関係で実装すべき）
 * @author imagepit
 */
public abstract class AbstractPlayer {
	// フィールド
	private String mediaName;
	// ゲッター・セッター
	public String getMediaName() {
		return mediaName;
	}
	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}
	// 読み込み・再生処理
	public void play() {
		loadDisc();
		playDisc();
	}
	/**
	 * 抽象メソッド
	 */
	protected abstract void loadDisc();
	protected abstract void playDisc();
}
