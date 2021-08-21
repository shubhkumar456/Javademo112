package methodswithreturntype;

public class Calcwithreturn2 {

    public double addition(double a, double b){
        double result= a+b;
        return result;
    }

    public double division(double a, double b){
        double result= a/b;
        return result;
    }

    public double substraction(double a, double b){
        double result= a-b;
        return result;
    }
    public double multiplication(double a, double b){
        double result= a*b;
        return result;
    }




    public static void main(String[] args) {
        Calcwithreturn2 object= new Calcwithreturn2();
        double output= object.addition(432.4,654.8);
        System.out.println("Addition of a number is  "+output);

        double ans= object.division(556.5,5.5);
        System.out.println("Division of a and b is  "+ans);

        double var =object.substraction(534.5,232.9);
        System.out.println("minus of a and b is  "+var);

        double value= object.multiplication(54.6,78.5);
        System.out.println("Value of two number in multiplication is   "+value);
    }
}
