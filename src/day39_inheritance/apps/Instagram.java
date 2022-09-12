package day39_inheritance.apps;

public class Instagram extends App{
    /* - Instagram class inherits App class

    - create constructor to call parent constructor and set up variables (name and version)

    - create method:
        postPicture()
            Example output: prints Posting picture to Instagram */

    public Instagram(String name, double  version){
        super(name,version);
    }
    public void postPicture(){
        System.out.println("posting picture to instagram");
    }
}
