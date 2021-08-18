package javamethods2;

public class Calculator2 {

    public void addition () {
    int a=32;
    int b=53;
    int result= a+b;
   System.out.println("The result of two integer number in addition is-----"+result);

}
    public void subtraction () {
        int a=12300;
        int b=10000;
        int result= a-b;
        System.out.println("The result of two integer number in subtraction is-----"+result);

    }
    public void multiplication () {
        int a=76;
        int b=95;
        int result= a*b;
        System.out.println("The result of two integer number in multiplication is-----"+result);

    }
    public void division () {
        int a=530;
        int b=53;
        int result= a/b;
        System.out.println("The result of two integer number in division is-----"+result);

    }

    public static void main(String[] args) {
        Calculator2 obj = new Calculator2();
           obj.addition();
           obj.subtraction();
           obj.multiplication();
           obj.division();
    }


}
