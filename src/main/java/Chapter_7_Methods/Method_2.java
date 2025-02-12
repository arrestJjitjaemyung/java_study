package Chapter_7_Methods;

import java.util.Scanner;

public class Method_2 {
    public static String getStar(int rows, int select) {
        String result = "";

        if (select == 1) {
            for(int i = 0; i < rows; i++) {
                for (int j = 0; j < i + 1; j++) {
                    result += "*";
                }
                result += "\n";
            }
        }
        else if (select == 2) {
            for(int i = 0; i < rows; i++) {
                for (int j = rows; j > i + 1; j--) { // 공백 기입
                    result += " ";
                }
                for (int k = 0; k < i + 1; k++) { // 별표 기입
                    result += "*";
                }
                result += "\n";
            }
        }
        else if (select == 3) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows - i; j++) {
                    result += "*";
                }
                result += "\n";
            }
        }
        else if (select == 4) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < i; j++) {
                    result += " ";
                }
                for (int k = 0; k < rows - i; k++) {
                    result += "*";
                }
                result += "\n";
            }
        }
        else
            System.out.println("유효한 숫자를 입력하세요.");

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowOfStars, choice;

        System.out.print("입력할 별의 줄 수 입력: ");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 좌측 편향 증가");
        System.out.println("2. 우측 편향 증가");
        System.out.println("3. 좌측 편향 감소");
        System.out.println("4. 우측 편향 감소");
        System.out.print("메뉴를 숫자로 선택: ");
        choice = scanner.nextInt();

        System.out.print(getStar(rowOfStars, choice));
    }
}
