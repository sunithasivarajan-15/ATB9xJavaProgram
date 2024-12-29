package Oct.ex_26102024;

import java.util.Scanner;

public class Lab01 {

    public String number (String name1, String name2 )
    {
        //System.out.println(name);
        String output=name1.concat(name2);
        return output;

    }
//    public int number1 (int c, int d)
//    {
//        //System.out.println(c);
//        int sum = c+d;
//        return sum;
//        //return c;
//    }

    public static void main(String[] args) {
       // String name ="Ganesha";
        //System.out.println(name);
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter e ");
//        int e=sc.nextInt();
//        System.out.println("Enter f ");
//        int f = sc.nextInt();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name1 ");
        String n1 =sc.next();
        System.out.println("Enter name2 ");
        String n2 = sc.next();


        Lab01 apurba = new Lab01();
        String print =apurba.number(n1,n2);
        System.out.println("Returning the value as "+print);
        //int final1 =apurba.number1(e,f);
        //System.out.println("Return type is returning " +final1);


    }



}
