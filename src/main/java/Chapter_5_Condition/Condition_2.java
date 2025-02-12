package Chapter_5_Condition;

import java.util.Scanner;

public class Condition_2 {
    public static void main(String[] args) {
        /*
        사용자에게 score 입력 받은 후 다음 조건 만족시키기.

        - 0 or 100 -: X
        0 - 59: F
        60 - 69: D
        70 - 79: C
        80 - 89: B
        90 - 100: A
         */
        Scanner scanner = new Scanner(System.in);

        int score = 0;

        System.out.print("점수 입력: ");
        score = scanner.nextInt();

        if(score >= 0 && score < 60) {
            System.out.println("입력한 점수는 " + score + "점이며, 학점은 F 입니다.");
        }
        else if(score < 70) {
            System.out.println("입력한 점수는 " + score + "점이며, 학점은 D 입니다.");
        }
        else if(score < 80) {
            System.out.println("입력한 점수는 " + score + "점이며, 학점은 C 입니다.");
        }
        else if(score < 90) {
            System.out.println("입력한 점수는 " + score + "점이며, 학점은 B 입니다.");
        }
        else if(score <= 100) {
            System.out.println("입력한 점수는 " + score + "점이며, 학점은 A 입니다.");
        }
        else {
            System.out.println("입력한 점수는 " + score + "점이며, 학점은 X 입니다.");
        }
    }
}