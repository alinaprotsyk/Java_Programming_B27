package day39_inheritance.discord;

public class DiscordRunner {
    public static void main(String[] args) {

        Student student1 = new Student("Student","Busra",362598);
        student1.sendMessage();
        System.out.println(student1);

        Admin admin1 = new Admin("Admin","Rreze",369852);
        admin1.createChannel();
        System.out.println(admin1);

    }
}
