package day21_nested_loop;

public class PrintTriangle {
    public static void main(String[] args) {
        /*
        Print this shape:

    * * * * * * * *
    * * * * * * *
    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
         */
        for (int i = 1; i <= 8; i++) {
            for (int j = 8; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
