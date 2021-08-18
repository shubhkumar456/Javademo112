package javamethods2;

public class Calculator4 {
    public void addition(){
        double a=23.5;
        double b=12.4;
        double result= a+b;
        System.out.println("the addition of double number in addition is....-"+result);
    }
    public void subtraction(){
        double a=735.6;
        double b=120.5;
        double result= a-b;
        System.out.println("the subtraction of double number in addition is....-"+result);
    }
    public void multiplication(){
        double a=27.4;
        double b=87.5;
        double result= a*b;
        System.out.println("the multiplication of double number in addition is....-"+result);
    }
    public void division(){
        double a=120.5;
        double b=7.5;
        double result= a/b;
        System.out.println("the division of double number in addition is....-"+result);
    }

    public static void main(String[] args) {
        Calculator4 obj = new Calculator4();
            obj.addition();
            obj.subtraction();
            obj.multiplication();
            obj.division();
    }

}
