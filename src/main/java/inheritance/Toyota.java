package inheritance;

public class Toyota extends Car {
     public void hybrid (){
         System.out.println("Toyota uses hybrid engine...");
     }
     public Toyota(){
        super(5);
         System.out.println("Toyota parametresiz constructor");
     }
    public Toyota(String s){
        System.out.println("Toyota parametreli constructor");
    }

}
