package Chapter_3_Operator;

public class Main {
    public static void main(String[] args) {
        /*
         복합 대입 연산자
         +=, -=, *=. /=
         i++ (i--): 실행 후 변수에 1을 더함(뺌).
         ++i (--i): 실행 전 변수에 1을 더함(뺌).
         */

        int j = 20;
        System.out.println(j++);
        System.out.println(j);
        System.out.println(++j);

        /*
        수식 연산자
        +, -, *, /, %(나머지)
         */

        System.out.println(2147483647%7);
    }
}
