package day39_inheritance.discord;

public class Student extends DiscordUser {

 /*
    - Student class inherits DiscordUser class

    - create constructor to call parent constructor and set up variables (role - Student, name, id)

    - create method:
        sendMessage()
            Example output: prints Sending message to class chat
     */

    public Student(String role, String name, long ID) {
        super(role, name, ID);
    }

    public void sendMessage() {
        System.out.println("Sending message to class chat");
    }
}
