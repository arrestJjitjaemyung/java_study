package Chapter_11_Arrays;
/*
    배열 전체 출력
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest_3 {
    public static void main(String[] args) {
        Random rd = new Random();

        int no1 = rd.nextInt(), no2;

        int[] arr1s = new int[10];

        for (int i = 0; i < arr1s.length; i++) {
            arr1s[i] = i + 1;
            System.out.print(i + 1 + " ");
        }
        System.out.println();

        for (int arr1: arr1s) {
            System.out.print(arr1 + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr1s)); // 배열 전체를 한번에 출력

        // Ascending array
        Arrays.sort(arr1s); // 순서를 변경하기에 index no. (arr1s[i])도 달라짐.
        System.out.println("Ascending: " + Arrays.toString(arr1s));

        // Descending array
        Integer[] arr2s = {1, 2, 3};
        Arrays.sort(arr2s, Comparator.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(arr2s));

        Double a = 1.2;
    }
}
