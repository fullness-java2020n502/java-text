package practice25;

public abstract class AbstractPlayer {
	protected abstract void loadDisc();
	protected abstract void playDisc();
	private String mediaName;
	public String getMediaName() {
		return mediaName;
	}
	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}
	public void play() {
		loadDisc();
		playDisc();
	}
}
