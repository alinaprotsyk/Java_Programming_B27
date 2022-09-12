package day06_operators;

public class GiftCard {
    public static void main(String[] args) {
        int giftCard = 500;
        int timeUsed = 3;
        int purchase = 150;
        int newAmount = giftCard - purchase;
        System.out.println(" I used my gift card yesterday " + timeUsed + "times " + "and I spend: $" + purchase + " And now my amount is: $" + newAmount);
        int timeUsed2 = 1;
        int purchace2 = 99;
        int newAmount2 = newAmount - purchace2;
        System.out.println(" I used my gift card again today " + timeUsed2 + "times " + " and my new gift card amount is: $" + newAmount2 );

        System.out.println("_____________________");

        int a = 8;
        int b = a--;
        System.out.println("a = " + a);
        System.out.println(" b = " + b);

    }
}
