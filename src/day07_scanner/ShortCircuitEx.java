package day07_scanner;

public class ShortCircuitEx {
    public static void main(String[] args) {
        System.out.println(true && true); // true
        System.out.println(false && true); // false
        //System.out.println(5/0); you cannot devide by 0
        //System.out.println(true && 5/0== 0);
        System.out.println(false && 5/0== 0);
        //System.out.println(false & 5/0 == 0);

        System.out.println(true || false);

        int count = 0;
        System.out.println(true || count++ == 1);
        System.out.println(count);

    }
}
