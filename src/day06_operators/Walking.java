package day06_operators;

public class Walking {
    public static void main(String[] args) {
        boolean isRaining = true;
        int temperature = 72;
        boolean walk = !isRaining && temperature > 68;
        System.out.println("Should I go for a walk: " + walk);

    }
}
