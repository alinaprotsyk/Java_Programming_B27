package day11_nested;

public class Amazon {
    public static void main(String[] args) {
        double  price = 10.99;
        boolean isPrime = false;


        if(isPrime) {
            System.out.println("Free 2 day shipping");
        } else {
            // you do not have prime
            if(price >= 25){
                System.out.println("Free shipping availiable");
            } else {
                System.out.println("Shippping cost is $2.99");
            }
        }
    }
}
