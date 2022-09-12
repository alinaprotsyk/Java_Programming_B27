package day14_string;

public class Password {
    public static void main(String[] args) {
        /*
        Declare and assign a String for password
the password should be more than 8 character long
print: Valid password or Invalid password
         */

        String password = "Alinka";
        String userPassword = "alinka";

        System.out.println(password.equals(userPassword));
        System.out.println(userPassword);

        if((password == userPassword) && password.length() >=8 ){
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

    }
}
