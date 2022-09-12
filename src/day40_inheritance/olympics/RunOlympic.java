package day40_inheritance.olympics;

public class RunOlympic {
    public static void main(String[] args) {

        Surfing surfing = new Surfing("Surfing", 6);
        System.out.println(surfing);
        System.out.println(surfing.compete());

        System.out.println();

        Track track = new Track("Track", 4);
        System.out.println(track);
        System.out.println(track.compete());

        System.out.println();

        Soccer soccer = new Soccer("Soccer", 11);
        System.out.println(soccer);
        System.out.println(soccer.compete());

    }
}
