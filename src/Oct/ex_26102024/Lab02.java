package Oct.ex_26102024;

import java.util.Scanner;

public class Lab02 {

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
        Lab02 obj = new Lab02();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int addition = obj.number1(a,b);
        int substraction =obj.number1(a,b,c);
        System.out.println("Sum value is " +addition);
        System.out.println("Sub value is " +substraction);



    }
}
