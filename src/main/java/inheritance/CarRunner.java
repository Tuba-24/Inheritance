package inheritance;

public class CarRunner {
    public static void main(String[] args) {

        Toyota t1 = new Toyota();/*Car parametresiz constructor
                                   Toyota parametresiz constructor*/

        System.out.println("**************************");

        Toyota t2 = new Toyota("Prius");/*Car parametresiz constructor
                                           Toyota parametreli constructor*/

        System.out.println("***************************");


        Toyota t3 = new Toyota();/*Car parametreli constructor
                                    Toyota parametresiz constructor*/
    /* Eger toyota clasindaki parametresiz constructor un altina super(5) koyarsak ilk once
     parent`taki (Car class) parametreli constructor`a gidip daha sonra
     toyota`daki parametresiz constructor`a gelir.
     */
        System.out.println("*****************************");
        System.out.println(t1.model);//Prius
        System.out.println(t1.price);//50000
        t1.hybrid();//Toyota uses hybrid engine...
        t1.engine();//Cars have engine..
        t1.move();//Cars move


    }
}
