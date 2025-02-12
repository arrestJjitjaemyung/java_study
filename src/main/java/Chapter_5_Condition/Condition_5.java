package Chapter_5_Condition;

import java.util.Scanner;

public class Condition_5 {
    public static void main(String[] args) {
        /*
        사용자에게 score 입력 받은 후 다음 조건 만족시키기.

        - 0 or 100 -: X
        0 - 59: F
        60 - 69: D
        70 - 79: C
        80 - 89: B
        90 - 100: A

        if문으로 - 0 or 100 - 걸러내기
        나머지는 switch문으로 작성
         */
        Scanner scanner = new Scanner(System.in);

        int score = 0, changedScore;
        String grade = "";


        System.out.print("점수 입력: ");
        score = scanner.nextInt();
        changedScore = score / 10;

        if(score < 0 || score > 100) {
            grade = "X"; // 명령문이 한 줄이면 중괄호 생략 ㄱㄴ.  C랑 똑같다.
        }
        else {
            switch (changedScore) {
                /*
                case 10: // case 9로 바로 넘어간다.
                case 9:
                    grade = "A";
                    break;

                로도 ㄱㄴ하다.
                 */
                case 10, 9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                default:
                    grade = "F";
            }
        }
        System.out.println("입력한 점수는 " + score + "점이며, 학점은 " + grade + " 입니다.");
    }
}
