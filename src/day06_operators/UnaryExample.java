package day06_operators;

public class UnaryExample {
    public static void main(String[] args) {
        int n = 0; // 0
        n++; // post increment, value becomes 1
        System.out.println(n); //1
        ++n; // pre increment, value becomes 2
        System.out.println(n); //2

        System.out.println(++n); // pre increment, value becomes 3, than it prints the value

        System.out.println(++n); // pre increment, value becomes 4, than it prints the value
        System.out.println(n);
        System.out.println("post number:");
        System.out.println(n++); // post increment, prints current number which is 4, than it will increment by 1
        System.out.println(n);
        System.out.println("-----------");
        int x = 4;
        int y =x;
        int z = ++x; // pre increment

        System.out.println("x " + x); // 4 ----> 5
        System.out.println("y " + y);//4
        System.out.println("z " + z); //5

        int candy = 5;
        System.out.println("Your kid asks for candy, you have " + candy);
        System.out.println("You give them one, so now you have " + --candy); // decrement, subtract 1 first, than print it
        System.out.println("The sibling comes in and they want one, you check how many there than give them one " + candy--); // post decrement
        System.out.println("Total candy in jar now " + candy);


        // Use case: counting:
        // your name, we want to find how many times your nme has a letter 'A'
        int counter = 0;
        counter++;
        // we find another a
        counter++;

    }
}
