package Chapter_6_Loops;

public class Loop_3 {
    public static void main(String[] args) {
        // Nested for

//        int a, b;
//
//        for(int i = 0; i < 5; i++) {
//            a = i;
//            System.out.println("a의 값: " + a);
//            for(int j = 0; j < 5; j++) {
//                b = j;
//                System.out.println("b의 값: " + b);
//            }
//            System.out.println("b 커맨드 end로 새로운 a 대입");
//        }

        for(int num1 = 2; num1 < 10; num1++) {
            for(int num2 = 1; num2 < 10; num2++)
                System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
            System.out.print("\n");
        }
    }
}
