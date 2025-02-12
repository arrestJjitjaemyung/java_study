package Chapter_6_Loops;

public class Loop_1_For {
    public static void main(String[] args) {
        /*
        반복문:
            for: 명확한 반복 횟수가 결정되어 있을 때 사용. C랑 같다.
            Enhanced for
            while
         */
        int sum = 0;

        for(int i = 0; i < 100; i++)
            sum += i + 1;

        System.out.println("1 + 2 + ... + 100 = " + sum);
    }
}
