package Chapter_11_Arrays;

// 로또 번호 추첨기

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest_7_LottoNumbers {
    public static void main(String[] args) {
        int[] lottoNo = new int[6];
        int[][] lottoAns = new int[5][6];
        boolean duplicate = false;

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < lottoNo.length; i++) {
            lottoNo[i] = rd.nextInt(1,46); // 1 =<< 46, 1 =<<= 45
        }

//        System.out.println(Arrays.toString(lottoNo));

        for (int i = 0; i < lottoAns.length; i++) {
            for (int j = 0; j < lottoAns[i].length; j++) {
                System.out.print(i + 1 + "게임 " + (j + 1) + "번째 번호 입력: ");
                lottoAns[i][j] = sc.nextInt();
            }
            System.out.println("--------------------");
        }

        for (int[] lottoAn: lottoAns) {
            System.out.println(Arrays.toString(lottoAn));
        }


    }
}
