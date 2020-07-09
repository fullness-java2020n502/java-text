package section1.practice12;

/**
 * 図形アートを描画するクラス
 * @author imagepit
 */
public class TriangleArtCreator {
	// フィールド
	int number; // 図形の数
	String shape; // 図形の形状

	// メソッド（振る舞い）
	// 図形アートを描画する
	public void drawArt() {
		encodeShape();
		for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i - 1; j++) {
                System.out.print("　");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(shape);
            }
            System.out.println();
        }
	}

	// 日本語から記号に変換
	private void encodeShape() {
		switch(shape) {
		case "三角":
			shape = "▲";
			break;
		case "菱形":
			shape = "◆";
			break;
		case "星":
			shape = "★";
			break;
		default:
			break;
		}
	}
}
