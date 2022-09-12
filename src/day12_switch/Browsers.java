package day12_switch;

public class Browsers {
    public static void main(String[] args) {
       String browser = "Chrome";


       switch (browser) {
           case "chorome" :
           case "CHROME":
           case "Chrome":
               System.out.println("opening google in chrome");

               break;
           case "firefox" :
               System.out.println("opening google in firefox");
               break;
           case "Safari":

           case "safari" :
               System.out.println("special set up or apple computers");
               System.out.println("opening in safari");
break;

           default:
               System.out.println("opening in chrome by default");


       }







    }
}
