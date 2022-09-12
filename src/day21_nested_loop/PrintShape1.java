package day21_nested_loop;

public class PrintShape1 {
    public static void main(String[] args) {
        /*
        Print these shapes:

    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
         */
        for (int j = 0; j < 8; j++) {


            for (int i = 0; i <9; i++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
