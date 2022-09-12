package day09_if_statements;

public class PayDay {
    public static void main(String[] args) {

        double hourlyRate = 60;
        int hoursPerWeek = 50;
        double netPay;

        if(hoursPerWeek > 40){
            // overtime calculation
         int overtimeHours = hoursPerWeek - 40;
         netPay = hourlyRate * 40; // calculate normal pay for 40 hours week
            netPay += hourlyRate * overtimeHours * 1.5; // overtime money


        } else{
            // worked under 40 hours or equal, so no over time
           netPay = hourlyRate * hoursPerWeek;


        }
        System.out.println("Net pay: " + netPay);
    }
}
