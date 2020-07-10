package practice23;

/**
 * CDプレイヤー（子クラス）
 * @author imagepit
 */
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
