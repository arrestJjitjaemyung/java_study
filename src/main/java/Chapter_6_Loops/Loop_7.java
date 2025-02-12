package Chapter_6_Loops;

import java.util.Scanner;

public class Loop_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        boolean isEmpty = false;

        while (!isEmpty) {
            System.out.print("n 기입: ");
            n = scanner.nextInt();

            if (n == 0) {
                isEmpty = true;
                break; // 즉시 while 문을 종료시킴. 이하 코드들을 실행시키지 않음.
            }
            System.out.println("n: " + n); // break; 실행 시 실행되지 않음.
        }
        // while 문은 조건의 참/거짓을 검토 후 모든 코드를 실행시킴.
    }
}
