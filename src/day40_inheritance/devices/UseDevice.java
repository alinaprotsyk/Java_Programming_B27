package day40_inheritance.devices;

public class UseDevice {
    /*
    create an object of TV and Phone and verify if constructor, toString(), and useDevice() are working properly for each class

	List the is a relations of all the classes


     */
    public static void main(String[] args) {
        TV obj1 = new TV("Samsung", 2020, 850, true);
        System.out.println(obj1);
        System.out.println();

        Phone obj2 = new Phone("Apple 11 pro max", 2020, 1100, true);
        System.out.println(obj2);
    }
}
