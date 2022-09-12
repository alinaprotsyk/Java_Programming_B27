package day16_string;

public class Id {
    public static void main(String[] args) {
        /*
        Given a first name and last name create and return an id using the following format:
    the first letter of the first name as lowercase,
    the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
    the length of the first String multiplied by 2

    first name: john
    last name: smith

    id: jSmi8
         */
        String firstName = "john";
        String lastName = "smith";
        firstName = firstName.toLowerCase();
        lastName = lastName.toUpperCase();
        System.out.println(firstName.substring(0,1) + lastName.substring(0,3) + firstName.length()*2 );


    }
}
