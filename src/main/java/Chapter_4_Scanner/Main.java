package Chapter_4_Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner class import
        Scanner scanner = new Scanner(System.in); // Scanner sc = ...로 쓰기도.
        System.out.print("올해 년도 입력: "); // println()은 출력 후 자동 들여쓰기
        int year = scanner.nextInt();
        // double var = scanner.nextDouble(); 같이 자료형에 맞는 function 사용
        System.out.println("올해 년도: " + year);

        String year1 = scanner.nextLine();
        System.out.println("올해 년도는 " + (year + 1) + "년 입니다.");
    }
}
