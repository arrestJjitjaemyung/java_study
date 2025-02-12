package Chapter_4_Scanner;

import java.util.Scanner;

public class Scanner_3_BMI_Calc {
    public static void main(String[] args) {
        /*
        BMI 계산기 작성

        1. 키를 cm로 입력
        2. 몸무게를 kg로 입력
        3. kg/m^2
        4. "당신의 BMI지수는 OO.OOOO입니다" 출력
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 키(cm): ");
        double height = scanner.nextDouble();
        System.out.print("당신의 무게(kg): ");
        double weight = scanner.nextDouble();

        System.out.println("당신의 BMI 지수는 " + (int)(weight / Math.pow(height / 100, 2)) + " 입니다.");
        // Math.pow(x, y) = x^y
    }
}
