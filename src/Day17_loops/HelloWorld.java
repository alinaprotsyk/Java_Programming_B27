package Day17_loops;

import day12_switch.SoccerGame;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");

        // infinite loop, doesn't stop
       //  while (true){
          //   System.out.println("Hello world");
        // }
        // print 50 times
        System.out.println();
        int counter = 1; // 0 loop counter < 50
        while (counter <= 50){
            System.out.println("Hello world " + counter);
            counter++; // this line adds 1 to the number each iteration, it allows the loop to stop at some point



        }



    }
}
