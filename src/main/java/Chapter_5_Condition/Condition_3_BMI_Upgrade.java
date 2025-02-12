package Chapter_5_Condition;

import java.util.Scanner;

public class Condition_3_BMI_Upgrade {
    public static void main(String[] args) {
        /*
        BMI
        18 -: 정상
        23 -: 과체중
        25 - :비만
         */
        Scanner scanner = new Scanner(System.in);

        int bmi = 0;

        System.out.print("당신의 키(cm): ");
        double height = scanner.nextDouble();

        if(height < 0) {
            System.out.println("유효한 신장을 입력하세요.");
        }
        else {
            System.out.print("당신의 무게(kg): ");
            double weight = scanner.nextDouble();

            bmi = (int)(weight / Math.pow(height / 100, 2));

            if(bmi > 25) {
                System.out.println("당신의 BMI 지수는 " + bmi + ", 비만입니다.");
            }
            else if(bmi > 23) {
                System.out.println("당신의 BMI 지수는 " + bmi + ", 과체중입니다.");
            }
            else if(bmi > 0){
                System.out.println("당신의 BMI 지수는 " + bmi + ", 정상입니다.");
            }
            else {
                System.out.println("유효한 체중을 입력하세요.");
            }
        }
    }
}