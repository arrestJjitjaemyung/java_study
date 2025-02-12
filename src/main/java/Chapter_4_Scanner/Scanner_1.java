package Chapter_4_Scanner;

import java.util.Scanner;

public class Scanner_1 {
    public static void main(String[] args) {
        /*
        scanner.next(): 띄어쓰기, 줄바꿈 불가
        scanner.nextLine(): 띄어쓰기 가능, 줄바꿈 불가

        next()와 nextLine()을 혼합 사용할 때 next()를 먼저 호출하면 호출 뒤 enter 문자로 인해
        nextLine()이 무시되고 해당 변수에는 빈 문자열만 저장됨.

        이를 해결하려면 Line 29 코드를 쓰자!
         */

        Scanner scanner = new Scanner(System.in);
//        System.out.print("님 이름: ");
//        String name = scanner.nextLine();
//        System.out.println("님 이름은 " + name);

        /*
        이름, 주소(시/군 or 도/시), 나이 입력
         */
        System.out.print("님 이름: ");
        String name = scanner.nextLine();
        System.out.print("님 나이: ");
        int age = scanner.nextInt();
        scanner.nextLine(); /// C의 age = getchar();와 비슷, /// 주석은 //와 별 차이 없음.
        System.out.print("님 주소(시/군 혹은 도/시): ");
        String address = scanner.nextLine();
        System.out.print("\n");
        System.out.println("님 이름: " + name);
        System.out.println("님 나이: " + age);
        System.out.println("님 내년 나이: " + (age + 1));
        System.out.println("님 주소: " + address);

        /*
        nextLine()은 enter 기준으로 입력문을 수용. nextInt() 입력 후 enter 누르면 다음 nextLine()이 대신 수용.
        Line 29 처럼 scanner.nextLine()을 배리어(함정)처럼 놔주자.
         */

        /**
         * Javadoc?이라는 곳에서 쓴다 함.
         * 1
         * 2
         * 3
         */
    }
}
