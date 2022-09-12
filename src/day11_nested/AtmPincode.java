package day11_nested;

import java.util.Scanner;

public class AtmPincode {
    public static void main(String[] args) {
        /*
        declare and assign two expected numbers:
	pincode: 1234
	ssn: 1111

ask the user to enter the two numbers and compare them with the system values defined above. If they match print Authentication successful

if they don't match print all the reasons that authentication failed:

	if the pincode was incorrect print: Pin Code is incorrect
	if the ssn was incorrect print: Last 4 SSN numbers are incorrect
         */
        int pincode = 1234;
        int ssn = 1111;
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your pincode");
        int customerPincode = input.nextInt();
        System.out.println("Please, enter your SSN");
        int customerSsn = input.nextInt();

        if (customerPincode == pincode && customerSsn == ssn){
            System.out.println("Authentication successful");

        }  else {
            if(customerPincode != pincode){
                System.out.println("Pin Code is incorrect");
            }
            if (customerSsn != ssn){
                System.out.println("Last 4 SSN numbers are incorrect");
            }
        }





    }
}
