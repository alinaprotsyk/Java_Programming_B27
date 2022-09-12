package day39_inheritance.discord;

public class Admin extends  DiscordUser{

  /*- Admin class inherits DiscordUser class
 - create constructor to call parent constructor and set up variables (role - Admin, name, id)
- create method:
        createChannel()
            Example output: prints Creating new discord channe */

        public Admin(String role, String name, long ID){
            super("Admin",name,ID);
        }

        public void createChannel() {
            System.out.println("Creating new discord channel...");
        }
}
