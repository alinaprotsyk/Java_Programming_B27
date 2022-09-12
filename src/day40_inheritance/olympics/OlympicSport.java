package day40_inheritance.olympics;

public class OlympicSport {

    /*
        Create a class OlympicSport

        instance variables
            - name (String)
            - participants (int)

        constructor:
            - initialize all fields

        methods:
            - compete(), toString()

            override compete in sub classes
     */

    String name;
    int participants;

    public OlympicSport(String name, int participants) {
        this.name = name;
        this.participants = participants;
    }

    public String compete(){
        return "Competing with " + participants + " participants";
    }

    @Override
    public String toString() {
        return "Olympic Sport: " + name + "\nNumber of participants: " + participants;
    }
}
