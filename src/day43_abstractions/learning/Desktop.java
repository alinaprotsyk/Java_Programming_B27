package day43_abstractions.learning;

public class Desktop implements Mac{

    @Override
    public void turnOn() {
        System.out.println("Desktop is turning on");
    }
}