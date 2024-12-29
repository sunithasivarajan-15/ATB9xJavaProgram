package Oct.ex_07112024;

public class Car {
    String model, name;
    int year;
    Car()
    {
        name ="unknown";
        model="XYZ";
        year =0;
        System.out.println(name);
        System.out.println("DC run");
    }
    public static void main(String[] args) {
       Car obj= new Car();
        System.out.println("I like " +obj.model);
        System.out.println("I like " +obj.year);
    }
}
