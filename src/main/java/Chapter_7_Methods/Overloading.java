package Chapter_7_Methods;

public class Overloading {
    /*
    Method overloading

    parameter 형태가 다르면 동일한 method명을 정의할 수 있다.
    즉, method명은 동일하고 parameter에 들어가는 자료형 및 변수명을 달리 사용 가능.

    overloading의 장점:
    동일한 기능을 하는 method 정의 시 method명이 필요한데(String 자료형끼리 잇는 method, int 합 method를 나누었을 때,
    double 합 method를 나누었을 때) add, plus, connect 사용.

    add(int a, int b)라는 method 정의 시
    add(1, 2) = 3, add(3, 3) = 6 처럼 1 + 2 + ... + 100의 합을 구할 순 있음.
    add(int a, int b, ...)로 정의할 때 n의 갯수가 고정돼있지 않으면 error 발생.

     */

    public static void add() {
        System.out.println("add()");
    }

    public static void add(String s) {
        System.out.println("add(String s)");
        System.out.println(s);
    }

    public static void add(int a, int b) {
        System.out.println("add(int a, int b)");
        System.out.println("a + b = " + (a + b));
    }

    public static void add(String s, int a) {
        System.out.println("add(String s, int a)");
        System.out.println(s + " / " + a);
    }

    public static void  add(int a, String s) { // parameter 순서가 달라도 overloading 해당됨.
        System.out.println("add(int a, String s)");
        System.out.println(a + " / " + s);
    }

    public static void main(String[] args) {
        add();
        add(1, 2);
        add("ㅎㅇ");
        add("ㅎㅇ", 1203);

    }
}
