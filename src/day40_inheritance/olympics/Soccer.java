package day40_inheritance.olympics;

public class Soccer extends OlympicSport{
    /*
    Create a class Soccer

    child class of OlympicSport

    constructor: set name and participants variables

    methods:
        compete(): Print Playing a soccer game
     */

    public Soccer(String name, int participants) {
        super(name, participants);
    }

    @Override
    public String compete(){
        return "Playing a soccer game";
    }

}
