package day39_inheritance.apps;

import day02_print_statements.Example;

public class youTube extends App {
    /*
   - Youtube class inherits App class

   - create constructor to call parent constructor and set up variables (name and version)

   - create method:
       watchVideo()
           Example output: prints Watching java tutorial
    */
    public youTube(double version){
        super("Youtube", version);
    }
    public  void  watchVideo(){

        System.out.println("Watching java tutorial");
    }

}
