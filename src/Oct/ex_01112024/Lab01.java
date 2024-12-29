package Oct.ex_01112024;

import Oct.ex_26102024.Lab02;

import java.util.Scanner;

public class Lab01 {
    public int number1(int a,int b)
    {
        int sum =a+b;
        return sum;
    }
    public int number1(int a,int b, int c)
    {
        int sub=a-b-c;
        return sub;
    }
    public static void main(String[] args) {
        Lab01 obj = new Lab01();
        //Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b= sc.nextInt();
//        int c= sc.nextInt();
        int a,b,c;

        int addition = obj.number1(5,10);
        //int substraction =obj.number1(a,b,c);
        System.out.println("Sum value is " +addition);
        //System.out.println("Sub value is " +substraction);



    }
}



