package Chapter_4_Scanner;

import java.util.Scanner;

public class Scanner_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 입력: ");
        int x = scanner.nextInt();

        System.out.print("y 입력: ");
        int y = scanner.nextInt();

        System.out.println("x + y = " + (x + y));
    }
}
