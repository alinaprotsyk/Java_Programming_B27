package day42_abstraction.library;

public class NonResidentException extends RuntimeException{
    /*
    Create a class NonResidentException
    make this a unchecked exception

    create a constructor to accept the String argument and pass it to the super constructor
     */

   public NonResidentException(){
       super("Sorry! Library card can be created for Fairfax and McLean residents");
   }


}
