package section1.practice12;

import java.util.Scanner;

/**
 *
 * [機 能] 三角形クラス<br>
 * [説 明] 三角形を出力する。<br>
 * [備 考] なし<br>
 * [環 境] OpenJDK 11 <br>
 * Copyright(c) 2019 Fullness, Inc. All Rights Reserved
 * @author [作 成] 2017/02/28 fullness(fullness)
 *         [修 正] 2019/10/30 fullness(fullness)
 */
public class TriangleDriver {
    /**
     *
     * [機 能] メインメソッド<br>
     * [説 明] 入力された数値の数文三角形を並べて出力する。<br>
     * [備 考] なし
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("数値を入力してください");
        int input = scanner.nextInt();

        System.out.println("図形を日本語で入力（星、菱形、三角とか）");
        String shape = scanner.next();

        TriangleArtCreator creator1 = new TriangleArtCreator();
        creator1.number = input;
        creator1.shape = shape;
        creator1.drawArt();

        TriangleArtCreator creator2 = new TriangleArtCreator();
        creator2.number = 10;
        creator2.shape = "菱形";
        creator2.drawArt();

    }
}
