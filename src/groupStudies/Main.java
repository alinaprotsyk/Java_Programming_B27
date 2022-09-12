package groupStudies;

public class Main {
    int n = 10;
    static  int z = 20;

    public static void main(String[] args) {
        Main obj = new Main();
        obj.z = 30;
        Main obj2 = new Main();
        obj2.n = 15;
        System.out.println(obj2.n + " " + obj2.z);
    }
}
