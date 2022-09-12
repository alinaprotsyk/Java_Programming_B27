package day33_arraList_with_collections;

public class UsingAnimals {
    public static void main(String[] args) {
        Animals animal1  = new Animals(); // creating an object of Animals class

        animal1.species = "Lions";
        animal1.numberOfLegs = 4;
        animal1.age = 15;
        animal1.canFly = false;
        animal1.weight = 200;

        System.out.println(animal1.species);
        System.out.println(animal1.numberOfLegs);
        System.out.println(animal1.age);
        System.out.println(animal1.canFly);
        System.out.println(animal1.weight);

        Animals animal2 = new Animals();
        System.out.println(animal2.species);

    }
}
