package section1.practice11;

import java.util.Scanner;

/**
 *
 * [機 能] continueクラス<br>
 * [説 明] continue文を利用して繰返し処理のスキップを行う。<br>
 * [備 考] なし<br>
 * [環 境] OpenJDK 11 <br>
 * Copyright(c) 2019 Fullness, Inc. All Rights Reserved
 * @author [作 成] 2017/02/28 fullness(fullness)
 *         [修 正] 2019/10/30 fullness(fullness)
 */
public class RepeatContinueDriver {
    /**
     *
     * [機 能] メインメソッド<br>
     * [説 明] continue文を利用して、配列を参照するための繰り返し処理をスキップする。<br>
     * [備 考] なし
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("駅名を入力してください");
        String input = scanner.next();
        String[] stations = new String[] {"品川", "大崎", "五反田", "目黒", "恵比寿", "渋谷",
                "原宿", "代々木", "新宿"};
        for (int i = 0; i < stations.length; i++) {
            String station = stations[i];
            if (station.equals(input)) {
                continue;
            }
            System.out.println(station);
        }
    }
}
