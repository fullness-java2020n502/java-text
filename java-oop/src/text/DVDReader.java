package text;

public interface DVDReader {
	int DISKRPM = 3000; // 定数になる（自動でpublis static finalが付与）
	void readMovie(); // 映画を読み込む（自動でpublic abstractが付与）
}
