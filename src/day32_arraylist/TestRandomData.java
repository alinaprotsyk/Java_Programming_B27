package day32_arraylist;

import my_utils.EasyData;

import java.util.ArrayList;
import java.util.Arrays;

public class TestRandomData {
    public static void main(String[] args) {
        System.out.println(EasyData.getRandomNumber(10));

        ArrayList<Integer> nums = EasyData.getRandomNumber(20);
        System.out.println(nums);
    }
}
