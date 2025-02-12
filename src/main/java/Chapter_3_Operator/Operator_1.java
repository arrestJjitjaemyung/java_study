package Chapter_3_Operator;

public class Operator_1 {
    public static void main(String[] args) {
        /*
        논리 연산자
        true(1), false(0)
        boolean: true/false 자료형

        And(&&): 곱 연산자, 하나 이상 false면 false 출력
        Or(||): 합 연산자, 하나 이상 true면 true 출력
        Not(!): Toggle
         */

        boolean flag1 = true;
        boolean flag2 = false;

        boolean result1 = flag1 && flag1;
        System.out.println(result1);

        boolean result2 = flag1 && flag2;
        System.out.println(result2);

        boolean result3 = flag2 && flag2;
        System.out.println(result3);

        boolean result4 = flag1 || flag1;
        System.out.println(result4);

        boolean result5 = flag1 || flag2;
        System.out.println(result5);

        boolean result6 = flag2 || flag2;
        System.out.println(result6);

        boolean result7 = flag1 && flag2 || flag1; // true && false || true --> false || true --> true
        System.out.println(result7);

        boolean result8 = 10 % 3 == 0; // false
        System.out.println(result8);

        boolean result9 = 10 % 3 != 0; // true
        System.out.println(result9);
    }
}
