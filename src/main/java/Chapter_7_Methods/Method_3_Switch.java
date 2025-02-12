package Chapter_7_Methods;

import java.util.Scanner;

public class Method_3_Switch {
    // Switch_refactored version of Method_2

    public static String getStar(int totalLine, int menuSelect) {
        String result = "";

        switch (menuSelect) {
            case 1:
                for(int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 2:
                for(int i = 0; i < totalLine; i++) {
                    for (int j = totalLine; j > i + 1; j--) { // 공백 기입
                        result += " ";
                    }
                    for (int k = 0; k < i + 1; k++) { // 별표 기입
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 3:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < totalLine - i; j++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            case 4:
                for (int i = 0; i < totalLine; i++) {
                    for (int j = 0; j < i; j++) {
                        result += " ";
                    }
                    for (int k = 0; k < totalLine - i; k++) {
                        result += "*";
                    }
                    result += "\n";
                }
                break;
            default:
                result += "유효한 숫자를 선택하세요.";
                // sout(getStar()) 형태로 작성하면 어차피 main에서 나오기에 result에 대입해도 OK.
        }

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