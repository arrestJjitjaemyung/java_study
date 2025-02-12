package Chapter_5_Condition;

import java.util.Scanner;

public class Condition_1 {
    public static void main(String[] args) {
        /*
        조건문

        if문:
        if(조건식1) {
            실행문1
        }
        else if(조건식2) {
            실행문2
        }
        else {
            실행문3
        }
         */
        Scanner scanner = new Scanner(System.in);

        int point = 0; // 타인과의 협업을 염두해 두고 변수를 미리 선언 후 재대입하는 방식이 가독성이 올라감.
        final int VIP = 80;
        final int GOLD = 60;
        final int SILVER = 40;
        final int BRONZE = 20;

        System.out.print("회원 포인트 입력: ");
        point = scanner.nextInt();

        if(point > VIP) {
            System.out.println("회원의 등급: VIP");
        }
        else if(point > GOLD) {
            System.out.println("회원의 등급: GOLD");
        }
        else if(point > SILVER) {
            System.out.println("회원의 등급: SILVER");
        }
        else if(point > BRONZE) {
            System.out.println("회원의 등급: BRONZE");
        }
        else {
            System.out.println("회원의 등급: NORMAL");
        }


    }
}
