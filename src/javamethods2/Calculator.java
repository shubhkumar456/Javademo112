package javamethods2;

public class Calculator {

    public void addition(){
        int a=90;
        int b=113;
        int result= a+b;
        System.out.println("The result of addition of two number is:-  "+result);
    }
    public void subtraction(){
        int a=17999;
        int b=15999;
        int result= a-b;
        System.out.println("The result of subtraction of two number is:-  "+result);
    }
    public void multiplication(){
        int a=53;
        int b=87;
        int result= a*b;
        System.out.println("The result of multiplication of two number is:-  "+result);
    }
    public void division(){
        int a=270;
        int b=9;
        int result= a/b;
        System.out.println("The result of division of two number is:-  "+result);
    }



    public static void main(String[] args) {
        Calculator obj= new Calculator();
           obj.addition();
           obj.subtraction();
           obj.multiplication();
           obj.division();
    }
}
