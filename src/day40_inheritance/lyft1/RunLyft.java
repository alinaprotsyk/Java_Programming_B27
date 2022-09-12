package day40_inheritance.lyft1;

public class RunLyft {
    public static void main(String[] args) {

        Lyft lyft = new Lyft("Regular", 100);
        System.out.println(lyft);

        System.out.println();

        LyftXL lyftXL = new LyftXL("Lyft XL", 150);
        System.out.println(lyftXL);

        System.out.println();

        Lux lux = new Lux("Lyft LUX", 150);
        System.out.println(lux);

    }
}
