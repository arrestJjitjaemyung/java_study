package Chapter_1_Variable;

public class Main {
    public static void main(String[] args) {
        System.out.println(23);
        /*
        Java 변수 선언 방식: camelCase
        Snake_case는 Python에서 많이 쓰임
         */
        boolean checkFlag = false;
        System.out.println(checkFlag);

        char name1 = '류';
        char name2 = '유';
        char name3 = '민';
        // System.out.println(name1 + name2 + name3); // strange numbers
        System.out.println("" + name1 + name2 + name3);
        /*
        문자(character)외 문자열(string)은 다름.
        line 20처럼 맨 앞 자료형을 string으로 정해야(""로 시작하면 괄호 안을 전부 string으로 취급.) 나머지가 따라감.
         */

        char name4 = '류';
        char name5 = '유';
        char name6 = '민';
        System.out.println("" + name4 + name5 + name6);

        int width1 = 100;
        int width2 = 200;
        System.out.println(width1 + width2);

        double pi = 3.1415929204;
        long longNum = 12345678912L; // long은 숫자 끝에 L을 붙임
        System.out.println(longNum);

        /*
        String은 대문자로 시작
         */

        String name = "안근수";
        int age = 38;
        System.out.println("제 이름은 " + name + "입니다. 제 나이는 " + (age + 1) + "살 입니다.");
        // string으로 정해진 sout 괄호 속 괄호는 계산이 우선된다.

        // Java17 이전에는 한줄만 작성가능했음. 그 후부터 다중 String 지원함.

        String intro = """
                제 이름
                방학특강 Java
                비전공자
                잘 부탁함
                """;
        System.out.println(intro);

        /*
            int / long
            int (4 바이트, 32 비트)
                최소값: -2,147,483,648 (−2^31)
                최대값: 2,147,483,647 (2^31 − 1)
            long (8 바이트, 64 비트)
                최소값: -9,223,372,036,854,775,808 (−2^63)
                최대값: 9,223,372,036,854,775,807 (2^63 − 1)
         */

        /*
        상수, 변수의 반대 개념
        선언과 동시에 초기화 ㄱㄴ, 재대입 불가
        변수와의 구분을 위해 상수는 전부 UPPERCASE 작성, SNAKE_CASE 사용
        선언 시 final 키워드가 붙음
         */
        final int FINAL_NUM = 123;
        // FINAL_NUM = 123; // Error
        System.out.println(FINAL_NUM);
        final String FILE_PATH = "C:\\Windows\\System32";
        System.out.println(FILE_PATH);
    }
}