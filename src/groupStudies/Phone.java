package groupStudies;

public class Phone {

    public Phone(String str){

        this(str.length());
        System.out.println(0);
    }
    public Phone(int num){

        this();
        System.out.println(num);
    }
    public Phone(){
        System.out.println(1);
    }
}
