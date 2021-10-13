package scanner_class;

import java.util.Scanner;

public class Calculator_with_scanner {

       public int addition(int a, int b){
           int result =a+b;
           return result;
       }

       public int addition2(int a, int b){
           int result =a+b;
           return result;

       }

       public int substraction(int a,int b){
           int result =a-b;
           return result;
       }

       public int multiplication(int a,int b){
           int result =a*b;
           return result;

       }

       public int division(int a, int b){
           int result = a/b;
           return result;
       }

    public static void main(String[] args) {
        Calculator_with_scanner obj = new Calculator_with_scanner();

        Scanner myObj = new Scanner(System.in);
        System.out.println("please enter value of A");
        int A = myObj.nextInt();
        System.out.println("please enter value of B");
        int B = myObj.nextInt();

        int result = obj.addition(A,B);
        System.out.println("Addition is :"+result);

        System.out.println("enter value of a");
        int a = myObj.nextInt();
        System.out.println("enter value of b");
        int b = myObj.nextInt();

        int sum = obj.addition2(a,b);
        System.out.println("Addition2 is "+sum);

        System.out.println("enter value of a1");
        int a1 = myObj.nextInt();
        System.out.println("enter value of b1");
        int b1 = myObj.nextInt();

        int output = obj.substraction(a1,b1);
        System.out.println("result of substraction is :"+output);

        System.out.println("enter value of a2");
        int a2 = myObj.nextInt();
        System.out.println("enter value of b2");
        int b2 = myObj.nextInt();

        int useroutput = obj.multiplication(a2,b2);
        System.out.println("result of multiplication is :"+useroutput);

        System.out.println("enter value of X");
        int X = myObj.nextInt();
        System.out.println("enter value of Y");
        int Y = myObj.nextInt();

        int out = obj.division(X,Y);
        System.out.println("getting result for division :"+out);




    }
}
