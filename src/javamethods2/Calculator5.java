package javamethods2;

public class Calculator5 {
    public void multiplication(){
        double a = 34.7;
        double b = 45.3;
        double result = a*b;
        System.out.println("The multiplication of double number is:-  "+result);

    }
    public void division(){
        double a = 1032.5;
        double b = 9.5;
        double result = a/b;
        System.out.println("The division of double number is:-  "+result);

    }
    public void subtraction(){
        double a = 1245.10;
        double b = 720.50;
        double result = a-b;
        System.out.println("The subtraction of double number is:-  "+result);

    }
    public void addition(){
        double a = 4345.54;
        double b = 6567.78;
        double result = a+b;
        System.out.println("The addition of double number is:-  "+result);

    }

    public static void main(String[] args) {
        Calculator5 obj = new Calculator5();
            obj.multiplication();
            obj.division();
            obj.subtraction();
            obj.addition();
    }
}
