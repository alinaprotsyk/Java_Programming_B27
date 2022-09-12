package day12_switch;

public class Starbucks {
    public static void main(String[] args) {
        /*
        drink:
        price
        calories
        tall:
        2.50
        100
        grande:
        4.00
        150
        venti
        4.50
        200
         */

     String size = "tall";
     double price = 0;
     int callories = 0;

     switch (size){

         case "tall":
             price = 2.50;
             callories = 100;
             break;
         case "grande":
             price = 4.00;
             callories =150;
             break;
         case "venti" :
             price = 4.50;

                     callories = 200;
                     break;


     }
if(price != 0 && callories != 0){
    System.out.println("Size: " + size + " is " + callories + " callories and cost $ " + price);
}




    }
}
