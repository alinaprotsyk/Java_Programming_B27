package groupStudies;

public class Test {
    public static void main(String[] args) {
        new B();
        B a = new B();
        B a2 = new  B("fun");
        B a3 = new B(2);
        System.out.println(B.count);
    }
}
