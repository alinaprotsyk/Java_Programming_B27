package day39_inheritance.discord;

public class DiscordUser {
    /*
        - create variables:
        role, name, id

    - create constructor to initialize the variables

    - create a toString() method

     */

    String role;
    String name;
    long ID;

    public DiscordUser(String role, String name, long ID){
        this.role = role;
        this.name = name;
        this.ID = ID;
    }

    public String toString() {
        return "DiscordUser{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
