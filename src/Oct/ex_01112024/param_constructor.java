package Oct.ex_01112024;

public class param_constructor {
    public static void main(String[] args) {
    Car2 obj = new Car2("tesla",2015);
        System.out.println(obj.model);
        System.out.println(obj.year);
    }
}
   class Car2
   {
       String model;
       int year;
       Car2(String model_name, int year_type)
       {
           this.model=model_name;
           this.year=year_type;
           System.out.println("Parameterized constructors");
       }
   }
