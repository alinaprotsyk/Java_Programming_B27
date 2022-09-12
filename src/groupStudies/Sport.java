package groupStudies;

public class Sport {
   String name;
   int numOfPlayers;
   boolean teamBase;

   public Sport(String name, int numOfPlayers, boolean teamBase){
      this.name = name;
      this.numOfPlayers = numOfPlayers;
      this.teamBase = teamBase;

   }
   public String toString(){
      return " The sport is " + name + " and has " + numOfPlayers + " payers in teams: " +teamBase;
   }

   public static void main(String[] args) {
      Sport soccer = new Sport("Basketball", 10, true);
      System.out.println(soccer);
   }
}
