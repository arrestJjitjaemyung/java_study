package Chapter_6_Loops;

public class Loop_5 {
    public static void main(String[] args) {
        /*
        *
        **
        ***
        ****
        *****
        *****
        ****
        ***
        **
        *
         */
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i = 0; i < 5; i++) {
            for(int j = 5; j > i; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}