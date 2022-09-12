package day37_static.computer;

public class CallingComputer {
    public static void main(String[] args) {

        Computer mac = new Computer(1500, "Apple", "silver");
        System.out.println(mac);
        Computer.info();
    }
}
