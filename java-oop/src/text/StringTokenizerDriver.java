package text;

import java.util.StringTokenizer;

public class StringTokenizerDriver {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("1,2,3,4",",");
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());

		}
	}
}
