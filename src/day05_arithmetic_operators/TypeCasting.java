package day05_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {
        byte b = 14;
        int i = b; // int is bigger, so this is okay
        long l = 40; // by default 40 is int type, int can automatically be stored into a long because int is smaller than long
        long l2 = 3000000000L; // 300000000 is int by default, but it is too big  for int type, so we need to tell computer it is long type with the L
        float f = 10; // 10 is int by default, int is smaller than float, so it will automatically be cast
        System.out.println(f);
        double d = 19.99;
        int i2 =  (int)d; // double is bigger than int, so i will need to cast
        System.out.println(i2);
        int i3 = 500;
        byte b2 = (byte)i3; // int is bigger than bite, so i will need to cast to byte
        System.out.println(b2);
        short s = 60;
        double d3 = s; // automatic: 60.0
        float f2 = (float)100.50; // or you can do 100.50f;
        long l3 = (long)f2;
        System.out.println(l3);
        double d4 =l3;
        System.out.println(d4);






    }
}
