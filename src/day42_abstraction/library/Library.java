package day42_abstraction.library;


    public class Library {

        //    create a method getLibraryCard(String city) - if the city is Fairfax or McLean print Library Card Created
// but if it is any other city throw your NonResidentException -> give a message in the constructor call
        public static String getLibraryCard(String city) {
            if (city.equalsIgnoreCase("Fairfax") || city.equalsIgnoreCase("McLean")) {
               return("Library Card Created");
            } else {
                throw new NonResidentException();
            }

        }

        // create a method borrow(boolean checkedOut) - if the given checkedOut boolean is true print "Enjoy reading"
        // but if the boolean is false throw your FailToCheckOutException -> handle this exception in the runner file

        public static String borrow(boolean checkedOut) throws FailToCheckOutException {
            if (checkedOut) {
               return ("Enjoy Reading");
            } else {
                throw new FailToCheckOutException();
            }
        }
    }