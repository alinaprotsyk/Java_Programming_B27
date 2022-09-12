package day38_encapsulation;

public class Airport {
    public static void main(String[] args) {
        FlightTickets ticket1  = new FlightTickets("first", "Chicago", "Virginia");
        System.out.println(ticket1.getType());

        System.out.println(ticket1.getDepartureLocation());
        System.out.println(ticket1.getArrivalLocation());

        FlightTickets ticket2 = new FlightTickets("flying", "New York", "Canada");
        System.out.println(ticket2.getType());


     ticket2.setType("economy");
        System.out.println(ticket2.getType());
    }
}
