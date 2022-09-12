package day40_inheritance.recap;

public class Phone { // super class


    // instance variables  , characteristics
    String brand;
    String model;
    double price;
    int memorySize;

    // methods    its like actions


    public Phone(){
this.brand = "noName";
this.model = "noModel";
this.price = -1;
    }

    public Phone(String model, double price, int memorySize){
        this.model = model;
        this.price = price;
        this.memorySize = memorySize;

    }
    public Phone(String brand, String model, double price, int memorySize) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.memorySize = this.memorySize;
    }

    public void calls(){
        System.out.println("Call phone");
    }

    public void texting(){
        System.out.println("Texting");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", memorySize=" + memorySize +
                '}';
    }
}

// subclass
class  iPhone extends Phone{
public iPhone(){

    super();
    this.brand = "iPhone";
}


    }

    class RunPhone{

        public static void main(String[] args) {
            iPhone iPhone12 = new iPhone();

            System.out.println(iPhone12);
        }
    }




