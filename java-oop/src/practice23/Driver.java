package practice23;

public class Driver {
	public static void main(String[] args) {
		CDPlayer cdPlayer = new CDPlayer();
		cdPlayer.setMediaName("ラブマシーン");
		cdPlayer.play();

		DVDPlayer dvdPlayer = new DVDPlayer();
		dvdPlayer.setMediaName("ツイスター");
		dvdPlayer.play();
	}
}
