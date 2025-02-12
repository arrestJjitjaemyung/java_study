package Chapter_5_Condition;

import java.util.Scanner;

public class Condition_4_Switch {
    public static void main(String[] args) {
        /*
        switch (변수) {
            case 조건1:
                실행문1;
                ...
                break;
            case 조건2:
                실행문2;
                ...
                break;
            ...
            default:
                실행문n;
        }
         */
        Scanner scanner = new Scanner(System.in);

        String selected = null; /// ""; 초기화도 ㄱㄴ

        System.out.println("[선택 프로그램 목록]");
        System.out.println("메뉴1");
        System.out.println("메뉴2");
        System.out.println("메뉴3");
        System.out.println("메뉴4");
        System.out.println("메뉴5");
        System.out.print("메뉴 선택: ");
        selected = scanner.nextLine();

        switch (selected) {
            case "1":
                System.out.println("메뉴1을 선택하셨습니다.");
                break;
            case "2":
                System.out.println("메뉴2를 선택하셨습니다.");
                break;
            case "3":
                System.out.println("메뉴3을 선택하셨습니다.");
                break;
            case "4":
                System.out.println("메뉴4를 선택하셨습니다.");
                break;
            case "5":
                System.out.println("메뉴5를 선택하셨습니다.");
                break;
            default:
                System.out.println("유효한 메뉴를 선택하세요.");
        }
    }
}
