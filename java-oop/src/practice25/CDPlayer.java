package practice25;

public class CDPlayer extends AbstractPlayer{
	@Override
	protected void loadDisc() {
		System.out.println("CD[" + getMediaName() + "]を読み込みます");
	}
	@Override
	protected void playDisc() {
		System.out.println("CD[" + getMediaName() + "]を再生します");
	}
}
