package day40_inheritance.olympics;

public class Surfing extends OlympicSport{
    /*
    Create a class Surfing

    child class of OlympicSport

    constructor: set name and participants variables

    methods:
        compete(): Print Surfing the waves
     */

    public Surfing(String name, int participants) {
        super(name, participants);
    }

    @Override
    public String compete(){
        return "Surfing the waves";
    }

}