package day39_inheritance.library;

public class AudioBook extends Book{

    String narrator;
    double duration;

}
 // AudioBook is a book
 // How many instance variables does AudioBook objects have access to?
// -> it has 6 from the super class
// -> plus 2 from its class, so total is 8