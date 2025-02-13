package Chapter_11_Arrays;
/*
    그냥 출력만 하면(sout(array1);) 주소값만 나온다. 참조 변수인지라.
 */

import java.io.PrintStream;

public class ArrayTest_1 {
    public static void main(String[] args) {
        int[] array1 = new int[5]; // 선언 방식 1, 선언만 함.
        int[] array2 = {1, 2, 3, 4, 5}; // 선언 방식 2, 선언 및 초기화됨.

        System.out.println(array1);
        System.out.println(array2);

        String strEx1 = "Hello";
        String strEx2 = new String("Hello");

        System.out.println(strEx1);
        System.out.println(strEx2);

        if (strEx1 == "Hello") {
            System.out.println("Run1");
        } // Ran

        if (strEx2 == "Hello") {
            System.out.println("Run2");
        } // Didn't run

        if (strEx2.equals("Hello")) {
            System.out.println("Run3");
        }

        int[] array3 = {10, 20, 30, 40};

        System.out.println(array3[0]);
        System.out.println(array3[1]);
        System.out.println(array3[2]);
        System.out.println(array3[3]);

        int[] array4 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i < 10; i++) {
            System.out.print(array4[i] + " ");
        }
        System.out.println();

        for (int i = 9; i >= 0; i--) {
            System.out.print(array4[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print((array4[i] + 1) + " ");
        }
        System.out.println();

        array4[0] += 1;

        System.out.println(array4[0]);


    }
}