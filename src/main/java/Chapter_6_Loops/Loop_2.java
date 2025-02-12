package Chapter_6_Loops;

import java.util.Scanner;

public class Loop_2 {
    public static void main(String[] args) {
        // n에 숫자 기입하여 반복 횟수를 결정하고 1부터 n까지 표시하는 반복문 작성

        Scanner scanner = new Scanner(System.in);

        int n = 0, sum = 0;

        System.out.print("1부터 표시할 숫자 겸 더할 숫자 표시: ");
        n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print(i + 1 + " ");
            sum += i + 1;
        }
        System.out.print("\n");
        System.out.println("1 + 2 + ... + " + n + " = " + sum);
    }
}