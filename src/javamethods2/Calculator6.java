package javamethods2;

public class Calculator6 {
    public void division(){
        double a = 17500.55;
        double b = 45.3;
        double result = a/b;
        System.out.println("The division of double number is:-  "+result);

    }
    public void multiplication(){
        double a = 654.34;
        double b = 87.67;
        double result = a*b;
        System.out.println("The multiplication of double number is:-  "+result);

    }
    public void subtraction(){
        double a = 20935.76;
        double b = 13495.67;
        double result = a-b;
        System.out.println("The subtraction of double number is:-  "+result);

    }
    public void addition(){
        double a = 54432.87;
        double b = 22987.56;
        double result = a+b;
        System.out.println("The addition of double number is:-  "+result);

    }

    public static void main(String[] args) {
        Calculator6 obj = new Calculator6();
          obj.division();
          obj.multiplication();
          obj.subtraction();
          obj.addition();
    }
}
