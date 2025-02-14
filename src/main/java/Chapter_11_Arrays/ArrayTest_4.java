package Chapter_11_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayTest_4 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
        int sum = 0, sumEven = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 10) + 1;
            System.out.print((numbers[i] * 10) + " ");

            sum += numbers[i];

            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
            }
        }
        System.out.println();
        System.out.println(sum);
        System.out.println(sumEven);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println(Arrays.toString(numbers));
    }
}
