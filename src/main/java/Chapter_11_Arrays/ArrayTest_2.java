package Chapter_11_Arrays;

import java.util.Scanner;
/*
    String[] names array 만들고
    출석부에 학생 등록

    [Output]
    1. ㅇㅇ
    2. ㅇㅇㅇ
    ...
 */

public class ArrayTest_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stuNum;

        System.out.print("등록할 학생의 수 입력: ");
        stuNum = sc.nextInt();
        sc.nextLine();
        String[] names = new String[stuNum];

        for (int i = 0; i < stuNum; i++) {
            System.out.print(i + 1 + "번째 학생 이름 입력: ");
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < stuNum; i++) {
            System.out.print(names[i] + " ");
        }
    }
}
