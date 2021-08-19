package javamethods2;

public class Calculator7 {

    public void substraction(){
        double a=123.89;
        double b=43.7;
        double result=a-b;
        System.out.println("there is the number we get after the the substraction:- "+result);

    }
    public void multiplication(){
        double a=23.89;
        double b=43.7;
        double result=a*b;
        System.out.println("there is the number we get after the the multiplication:- "+result);

    }
    public void division(){
        double a=153.89;
        double b=3.7;
        double result=a/b;
        System.out.println("there is the number we get after the the division:- "+result);

    }
    public void addition(){
        double a=123.89;
        double b=43.7;
        double result=a+b;
        System.out.println("there is the number we get after the the addition:- "+result);

    }

    public static void main(String[] args) {
        Calculator7 obj = new Calculator7();
          obj.substraction();
          obj.multiplication();
          obj.division();
          obj.addition();

    }

}
