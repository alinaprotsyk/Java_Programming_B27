package groupStudies;

public class B {
    static int count;

    public B(){
        count++;

    }
    public B(int i){
        count += i;
    }
    public B(String s){
        count += s.length();
    }
}


