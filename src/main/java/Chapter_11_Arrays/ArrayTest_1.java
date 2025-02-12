package Chapter_11_Arrays;
/*
    그냥 출력만 하면(sout(array1);) 주소값만 나온다. 참조 변수인지라.
 */

public class ArrayTest_1 {
    public static void main(String[] args) {
        int[] array1 = new int[5]; // 선언 방식 1, 선언만 함.
        int[] array2 = {1, 2, 3, 4, 5}; // 선언 방식 2, 선언 및 초기화됨.

        System.out.println(array1);
        System.out.println(array2);
    }
}
