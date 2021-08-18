package javamethods2;

public class Calculator3 {
    public void division(){
        int a=797;
        int b=23;
        int result =a/b;
        System.out.println("The division of two number is.....-"+result);
    }
    public void multiplication(){
        int a=59;
        int b=23;
        int result =a*b;
        System.out.println("The multiplication of two number is.....-"+result);
    }
    public void subtraction(){
        int a=23597;
        int b=17837;
        int result =a-b;
        System.out.println("The subtraction of two number is.....-"+result);
    }
    public void addition(){
        int a=23597;
        int b=17837;
        int result =a+b;
        System.out.println("The addition of two number is.....-"+result);
    }

    public static void main(String[] args) {
        Calculator3 obj = new Calculator3();
            obj.division();
            obj.multiplication();
            obj.subtraction();
            obj.addition();
    }


}
