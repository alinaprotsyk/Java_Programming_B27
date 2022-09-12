package day05_arithmetic_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        /*
        create a class SalaryCalculator
    add a main method
    declare and assign these variables:

       salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax

    Sample data:
       100000 (salary)
       0.08 (state tax rate)
       0.21 (federal tax rate)

    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

    Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
         */
        int salary  = 100000;
        double stateTaxRate =  0.08;
        double federalTaxRate = 0.21;
        double stateTax = salary *  stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTaxRate + federalTax;
        double salaryAfterTax = salary - totalTax;
        System.out.println( "Gross pay is: $" + salary);
        System.out.println( " The amount of taxes for state is: $ " + stateTax);
        System.out.println( " The amount of taxes for fedelar is: $ " + federalTax );
        System.out.println( " The total tax amount is: $ " + totalTax);
        System.out.println( " My salary after all taxes will be: $ " + salaryAfterTax);




    }
}
