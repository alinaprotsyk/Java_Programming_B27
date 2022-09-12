package day24_array_with_string;

public class HomeWork {
    public static void main(String[] args) {
        /*
        Given two values:
	app = "google"
	& zone = "us-east-1#us-west-1#us-west-2#eu-east-1#eu-west-1"

deploy the app to each zone. Each zone is seperated by the # character

	Ex:
		Deploying etsy to us-east-1...
		Deployment completed for us-east-1

		Deploying etsy to us-west-1...
		Deployment completed for us-west-1

		etc...
         */
        String app = "google";
        String zone = "us-east-1#us-west-1#us-west-2#eu-east-1#eu-west-1";
      /*  String [] zones = zone.split("#");

        for (String eachZone : zones){
            System.out.println("Deploying " + app + "to " + eachZone);
            System.out.println("Deployment completed for " + eachZone);
        }
       */
        String [] str = zone.split("#");
        for (int i = 0; i < str.length; i++) {
            System.out.println("Deploying " + app + " to " + str[i]);
            System.out.println("Deployment completed for " + str[i]);
            System.out.println();
        }
    }
}
