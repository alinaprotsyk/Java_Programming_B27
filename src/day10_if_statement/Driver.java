package day10_if_statement;

public class Driver {
    public static void main(String[] args) {
int oxygen = 50;
if(oxygen >= 90) {
    System.out.println("Your tank is full");
} else if (oxygen >= 80) {
    System.out.println("Still okay");

} else if (oxygen >= 70) {
    System.out.println("Do not go too far");
} else if (oxygen >= 60) {
    System.out.println(" Start to head back");
} else if (oxygen >= 50) {
    System.out.println("Be careful now you at 50 %");
}


    }
}
