package Day17_loops;

public class PrintLetters {
    public static void main(String[] args) {

        char first = 'A';
        while (first <= 'Z'){
            System.out.print(first++);
        }

        /*

            iteration 1:
                first = 'A'
                   'A' < 'Z' true
                   loop runs
                   prints(first) -> A
                   then increments because of post increment
                   first++ -> B

            iteration 2:
                first = B
                    B < Z true
                    loop runs
                    print(first) -> B
                    first++ -> C

         */
        System.out.println("------------");
        // printing z -a
        char backwards = 'z';
        while (backwards >= 'a'){
            System.out.print(backwards--);
        }
    }
}
