package inheritance;

public class Car {

    public String model = "Prius";
    public int price = 50000;

    public void move(){
        System.out.println("Cars move...");
    }

    public void engine(){
        System.out.println("Cars have engine...");
    }

    public Car(){
        System.out.println("Car parametresiz constructor");
    }

    public Car(int i){
        System.out.println("Car parametreli constructor");
    }


}
