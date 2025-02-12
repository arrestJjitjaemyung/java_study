package Chapter_7_Methods;

import java.util.Scanner;

public class ScoreCalc {
    /*
    점수들을 입력 받아 total 및 average를 내는 프로그램 작성.

    method와 main을 나눠서 구성
     */

    public static double addScores(double score1, double score2) {
        return score1 + score2;
    }

    public static double addScores(double score1, double score2, double score3) {
        return score1 + score2 + score3;
    }

    public static double addScores(double score1, double score2, double score3, double score4) {
        return score1 + score2 + score3 + score4;
    }

    public static double addScores(double score1, double score2, double score3, double score4, double score5) {
        return score1 + score2 + score3 + score4 + score5;
    }

    public static double addScores(double score1, double score2, double score3, double score4, double score5, double score6) {
        return score1 + score2 + score3 + score4 + score5 + score6;
    }

    public static double calcAvg(double totalScore, int numOfSubjects) {
        return totalScore / numOfSubjects;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double score1 = 0, score2 = 0, totalScore = 0, avgScore = 0;
//        int totalSubject = 2;
//
//        System.out.print("1과목 점수 입력: ");
//        score1 = scanner.nextDouble();
//        System.out.print("2과목 점수 입력: ");
//        score2 = scanner.nextDouble();
//        totalScore = score2 + score1;
//        avgScore = totalScore / totalSubject;
//
//        System.out.println("당신의 총점: " + totalScore);
//        System.out.println("당신의 평점: " + avgScore);

        System.out.println(calcAvg(addScores(100, 80), 2));
    }
}
