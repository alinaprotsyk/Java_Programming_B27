package day32_arraylist;

import my_utils.EasyData;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("friday", "java", "summer", "coding", "java", "coding", "java", "summer"));
        System.out.println(searchList(list, "java"));
        System.out.println(searchList(list, "coding"));
        System.out.println(searchList(list, "friday"));


        // testing easy data
        ArrayList<String> test = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        ArrayList<String > days = EasyData.getDaysOfWeek();
        System.out.println(days);
    }
    public static int searchList(ArrayList<String > list, String target){
int count = 0;
for (String each : list){
    if (each.equalsIgnoreCase(target)){
        count++;
    }
}
return count;
    }
}
