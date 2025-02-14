package Chapter_11_Arrays;

// Multi Dimensional Array

import java.util.Arrays;

public class ArrayTest_5 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {3, 4}, {5, 6}};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
        }
        System.out.println();

        for (int[] element: arr1) {
            for (int number: element) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }; // 솔직히 배열은 이렇게 선언해 줍시다


    }
}
