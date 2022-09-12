package day38_encapsulation;

public class TestAmazon {
    public static void main(String[] args) {
        AmazonAccount amazon = new AmazonAccount("Alina", "alina@gmail.com", false);

        System.out.println(amazon);

        amazon.setEmail("alina@mail.ru");
        System.out.println(amazon.getEmail());

        amazon.setUserName("Alinka");
        System.out.println(amazon.getUserName());
        amazon.setHasPrime(true);

        System.out.println(amazon.isHasPrime());
    }
}
