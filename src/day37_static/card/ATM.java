package day37_static.card;

public class ATM {
    public static void main(String[] args) {
        DebitCard card1 = new DebitCard(123456781234567L, "James Bond", "masterCard", 1234, 16000);
        DebitCard card2 = new DebitCard(12345678, "James James", "chase", 4587, 500);
        System.out.println(card1);
        System.out.println(card2);
        // Invalid and valid card numbers checking:
        DebitCard numCheck1 = new DebitCard(1234567, "James Blunt", 15780);
        DebitCard numCheck2 = new DebitCard(12345789123456789L, "James Jim", 9000);
        DebitCard numCheck3 = new DebitCard(1234567812345678L, "James Bond", 16000);
        System.out.println(numCheck1);
        System.out.println(numCheck2);
        System.out.println(numCheck3);
    }
}
