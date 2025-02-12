package Chapter_2_Conversion;

public class Main {
    public static void main(String[] args) {
        /*
        Conversion: 용량 이슈로 일어나는 문제를 해결하기 위함
        1. Upcasting: 더 큰 용량의 자료형 변환, 메모리 용량이 커지기만 하기해 기본적으로 Implicit 변형함.
        2. Downcasting: 더 작은 용량의 자료형 변환, 메모리 용량이 적어저 Overflow 발생 가능성 있기에 Explicit 변형만 함.
         */

        char cast1 = 'A';
        System.out.println("원형: " + cast1);
        // Upcasting 1
        System.out.println("변형: " + (int)cast1);
        char cast2 = 'a';
        System.out.println("원형: " + cast2);
        System.out.println("변형: " + (int)cast2);

        // Upcasting 2
        char cast3 = 'b';
        int cast4 = (int)cast3;
        System.out.println("원형: " + cast3);
        System.out.println("변형: " + cast4);

        int cast5 = 99; // Downcasting 1
        int cast6 = 100; // Downcasting 2
        char cast7 = (char)cast6;

        System.out.println("원형: " + cast5);
        System.out.println("변형: " + (char)cast5);
        System.out.println("원형: " + cast6);
        System.out.println("변형: " + cast7);

    }
}
