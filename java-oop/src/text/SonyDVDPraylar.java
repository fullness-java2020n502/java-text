package text;

/**
 * interfaceは「DB（永続化装置）」との接続部分でインターフェース化する事が多い
 *  - PostgresSQL
 *  - Oracle DB
 *  - MySQL
 *  - MongoDB
 * @author imagepit
 *
 */

public class SonyDVDPraylar implements DVDReader {
	@Override
	public void readMovie() {
		System.out.println("ソニーの音質で映画を読み込み再生する");
	}
}
