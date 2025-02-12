package Chapter_6_Loops;

public class Loop_6_While {
    public static void main(String[] args) {
//        int sum = 0;
//
//        for (int i = 0; i <= 5; i++) {
//            sum += i;
//        }
//        System.out.println("for: " + sum);
//
//        int i = 0;
//        sum = 0;
//        while (i <= 5) {
//            sum += i;
//            i++;
//        }
//        System.out.println("while: " + sum);

        /*
        1 2 3 4 5 6 7 8 9 10
        11 12 13 14 15 16 17 18 19 20
        ...
        91 92 93 94 95 96 97 98 99 100
         */
        for (int i = 0; i < 100; i++) {
            System.out.print(i + 1 + " ");

            if ((i + 1) % 10 == 0)
                System.out.println();
        }
        System.out.println();
        int i = 0;

        while (i < 100) {
            System.out.print(i + 1 + " ");

            if ((i + 1) % 10 == 0)
                System.out.println();
            i++;
        }
    }
}