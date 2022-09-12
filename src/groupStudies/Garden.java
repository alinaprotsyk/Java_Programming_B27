package groupStudies;

public class Garden {

    static Plant[] plants = {new Plant(4.1), new Plant(3.9), new Plant(4.3), new Plant(2.7) };

    public static void main(String[] args) {
        for (Plant each :Garden.plants ){
            System.out.println(each.height);
        }
    }
}
