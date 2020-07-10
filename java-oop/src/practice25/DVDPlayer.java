package practice25;

public class DVDPlayer extends AbstractPlayer{
	@Override
	protected void loadDisc() {
		System.out.println("DVD[" + getMediaName() + "]を読み込みます");
	}

	@Override
	protected void playDisc() {
		System.out.println("DVD[" + getMediaName() + "]を再生します");
	}
}
