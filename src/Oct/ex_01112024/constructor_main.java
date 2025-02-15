package Oct.ex_01112024;

public class constructor_main {
    public static void main(String[] args) {
       //constructor_param tesla = new constructor_param();
       constructor_param tesla = new constructor_param();

        //constructor_main
        System.out.println(tesla.car);
        System.out.println(tesla.year);

        constructor_param nano = new constructor_param();
        nano.car = "Tata Car";
        System.out.println("Updated nano car is " +nano.car);
    }
}
