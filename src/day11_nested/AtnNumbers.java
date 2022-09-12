package day11_nested;

import java.util.Scanner;

public class AtnNumbers {
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


int systemPin = 1234;
int systemSsn = 1111;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the pincode");
        int userPincode = input.nextInt();
        System.out.println("Enter your last 4 digits of SSN");
        int userSsn = input.nextInt();

if (systemPin == userPincode && systemSsn == userSsn ) {
    System.out.println("Authentication successful");
} else {

    if(systemPin != userPincode){
        System.out.println("Pin Code is incorrect");
    }

    if (systemSsn != userSsn){
        System.out.println("Last 4 SSN numbers are incorrect");
    }



}









    }
}
