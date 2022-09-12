package day40_inheritance.olympics;

public class Track extends OlympicSport{
    /*
    Create a class Track

    child class of OlympicSport

    constructor: set name and participants variables

    methods:
        compete(): Print Track for running, jumping, throwing
     */

    public Track(String name, int participants) {
        super(name, participants);
    }

    @Override
    public String compete(){
        return "Track for running, jumping, throwing";
    }

}