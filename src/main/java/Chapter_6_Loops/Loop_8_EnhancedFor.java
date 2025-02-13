package Chapter_6_Loops;
/*
    [Arrays 패키지와 연계됨]
    Enhanced for

    Read-only

    Form:
    for (자료형변수명: 반복가능개체(배열)) {
        실행문
        ...
    }
 */

public class Loop_8_EnhancedFor {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};

        // Normal for loop
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        // Enhanced for loop
        for (int j : arr1) {
            System.out.print(j + " ");
        }

        // 배열명은 복수 명사를 사용 ex) names, types, ...
        String[] names = {"일", "이", "삼"};

        for (String name: names) {
            System.out.print(name);
        }
    }
}