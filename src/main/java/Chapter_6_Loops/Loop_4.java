package Chapter_6_Loops;

public class Loop_4 {
    public static void main(String[] args) {
        // 별 찍기를 통한 for 구조 학습

//        for(int i = 0; i < 5; i++) {
//            for(int j = 0; j < i + 1; j++)
//                System.out.print("*");
//            System.out.println();
//        }

        // 숫자를 입력 받아 그 수만큼 별 찍기

//        Scanner scanner = new Scanner(System.in);
//
//        int n;
//
//        System.out.print("별 찍을 횟수: ");
//        n = scanner.nextInt();
//
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < i + 1; j++)
//                System.out.print("*");
//            System.out.println();
//        }

        // 역순 버전

//        for(int i = 0; i < 5; i++) {
//            for(int j = 5; j > i; j--)
//                System.out.print("🎈");
//            System.out.println();
//        }

        // 숫자를 입력 받아 그 수만큼 별 찍기 역순 버전

//        Scanner scanner = new Scanner(System.in);
//
//        int n;
//
//        System.out.print("풍선 찍을 횟수: ");
//        n = scanner.nextInt();
//
//        for(int i = 0; i < n; i++) {
//            for(int j = n; j > i; j--)
//                System.out.print("🎈");
//            System.out.println();
//        }

        /*
                  *
                 **
                ***
                ...
         */

        for(int i = 0; i < 5; i++) {
            for(int j = 5; j > i + 1; j--) { // 공백 기입
                System.out.print(" ");
            }
            for(int k = 0; k < i + 1; k++) { // 별표 기입
                System.out.print("*");
            }
            System.out.println(); // 개행
        }
    }
}