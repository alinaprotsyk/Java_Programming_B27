package HomeWork;

public class SalesAmount {
    public static void main(String[] args) {
         /*
        create a sales amount variable
use the sales amount to determine the bonus you get at end of the month

	if your sales amount is less than 10000 you don't get any bonus

	if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000

	if your sales amount is more than or equal to 15000 you get a bonus of 7000

	print your bonus number
         */
        int sales = 17000;
        if(sales < 10000)
            System.out.println("you don't get any bonus");
            if(sales >= 10000  && sales < 15000){
                System.out.println(" you get a bonus of 5000");
            }
            if(sales >= 15000) {
                System.out.println("you get a bonus of 7000");


            }

            }
        }




