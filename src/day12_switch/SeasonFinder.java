package day12_switch;

public class SeasonFinder {
    public static void main(String[] args) {


        /*
        Season Finder

declare and assign a month number. Bases on the below data determine what season it is and what kind of clothes to wear. You can create your own expectations of what kind of clothes to wear based on the month


	12, 1, 2 	--> Winter
	3, 4, 5 	--> Spring
	6, 7, 8 	--> Summer
	9, 10, 11 	--> Fall

Ex:
	2
	It is winter, so wear a winter coat, gloves and a hat
         */
       int mounth = 11;
       switch (mounth){
           case 12:
               System.out.println("It is winter, so wear a winter coat, gloves and a hat");
           case 1:
               System.out.println("It is winter, so wear a winter coat, gloves and a hat");
           case 2:
               System.out.println("It is winter, so wear a winter coat, gloves and a hat");
               break;
           case 3:
           case 4:
           case 5:
               System.out.println(" It is winter, so wear a winter coat, gloves and a hat");
               break;
           case 6:
           case 7:
           case 8:
               System.out.println("It is summer, so wear shorts, crop tops, dresses, flip flops, swimsuits and go to the beach");
           case 9:
           case 10:
           case 11:
               System.out.println("This is fall, so wear coats, hats, boots, scarfs");
               break;
           default:
               System.out.println("Invalid number");

       }



    }
}
