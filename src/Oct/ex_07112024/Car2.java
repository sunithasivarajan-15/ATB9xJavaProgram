package Oct.ex_07112024;

public class Car2 {
        String model, name;
        int year;
        Car2(String model_name,int year_created)
        {
            System.out.println("Parameterized Constructors");
            this.model=model_name;
            this.year=year_created;
        }
        void display()
        {
            System.out.println("Car2 Details "+this.model );
            System.out.println("Car2 Details "+this.year );
        }
// public static void main(String[] args) {
//            Car2 obj=new Car2("Nano",2015);
//            System.out.println(obj.model);
//            System.out.println(obj.year);
//
//
//}
}
