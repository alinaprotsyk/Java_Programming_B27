package day42_abstraction.library;

public class Runner {
    public static void main(String[] args) {
        /*
        Create a class to run the code by calling the methods and seeing the result with different inputs to see how the exceptions were related to the execution
         */

        try{
            System.out.println(Library.borrow(true));
        } catch (FailToCheckOutException e){
            e.printStackTrace();
        }
        System.out.println(Library.getLibraryCard("reston"));
    }
}
