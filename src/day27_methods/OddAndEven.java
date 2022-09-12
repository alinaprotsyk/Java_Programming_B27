package day27_methods;

public class OddAndEven {
    /*
    create a method that can print odd numbers between 1-100 in the
same line saperated by space

create a method that can print even numbers between 1-100 in the
same line saperated by space
     */

    public static void oddNumbers(){

        for (int i = 1; i <= 100; i++){
            if (i % 2 != 0){
                System.out.println(i + " ");
            }

        }
    }
      public static void evenNumbers(){

        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i + " ");
            }
          }
      }

    public static void main(StringToChar[] args) {
       evenNumbers();
        System.out.println();
        oddNumbers();
    }
}
