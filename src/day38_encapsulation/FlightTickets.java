package day38_encapsulation;

public class FlightTickets {
    /*
        declare these instance variables:
            type(first, business, economy
            departure
            arrival

         encapsulate all of them

         create constructor to set up the object

            Note: type should only be first, business, or economy

     */

   private String type;
   private String departureLocation;
   private String arrivalLocation;

   public FlightTickets(String type, String departureLocation, String arrivalLocation){
       setType(type);

       this.departureLocation = departureLocation;
       this.arrivalLocation = arrivalLocation;
   }

    public String getType() {
        return type;
    }

    public void setType(String type) {

        if (type.equalsIgnoreCase("first") || type.equalsIgnoreCase("business") || type.equalsIgnoreCase("economy")) {


            this.type = type;
        }
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }
}
