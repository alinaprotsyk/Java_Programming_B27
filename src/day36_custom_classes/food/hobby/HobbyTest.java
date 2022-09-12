package day36_custom_classes.food.hobby;

import java.util.ArrayList;

public class HobbyTest {
    public static void main(String[] args) {

        ArrayList<Hobby> allHobbies = new ArrayList<>();
        allHobbies.add(new Hobby("gym", 670, false, false));
        allHobbies.add(new Hobby("traveling", 12000, true, true));
        allHobbies.add(new Hobby("photography", 400, true, true));
        allHobbies.add(new Hobby("swimming", 100, true, false));
for (Hobby each : allHobbies){
    each.doIt();
}
        System.out.println("____________");

       // create a copy ArrayList and remove all outdoors Hobbies

        ArrayList<Hobby> removeOutdoors = new ArrayList<>(allHobbies);

        removeOutdoors.removeIf(p -> p.isOutdoor);
        System.out.println(removeOutdoors);
        System.out.println("___________________");
        //  create a copy ArrayList and remove all hobbies requiring other people

        ArrayList<Hobby> removePeople = new ArrayList<>(allHobbies);

        removeOutdoors.removeIf(p -> p.requiresOthers);
        System.out.println(removePeople);
        System.out.println("_____________");

        //create a copy ArrayList and remove all hobbies that cost more than $500 annually

        ArrayList<Hobby> cheaperHobby = new ArrayList<>(allHobbies);
        cheaperHobby.removeIf(p -> p.annualCost > 500);
        System.out.println(cheaperHobby);
    }
}
