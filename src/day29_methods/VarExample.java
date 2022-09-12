package day29_methods;

public class VarExample {
    public static void main(String[] args) {
        int[] a = {3, 1, 3, 5};
        // printAll(3, 1, 3, 5) ; this is nr valid because it is not an array
        printAll(a);
        System.out.println();

        // dynamic(a); this works
        dynamic(4, 1, 4, 5, 2, 7);
        System.out.println();
        dynamic("hello", "monday", "java");
    }

    public static void printAll(int[] nums) {
        for (int each : nums) {
            System.out.print(each + " ");
        }
    }

    public static void dynamic(int... nums) {
        for (int each : nums) {
            System.out.print(each + " ");
        }
    }

    public static void dynamic(String... words) {
        for (String each : words) {
            System.out.print(each + " ");
        }
    }
}
