package methodswithreturntype;

public class CalcWithReturntype {

    public int addition(int a, int b){
        int result=a+b;
        return result;
    }

    public int substraction(int a, int b) {
        int result = a - b;
        return result;
    }

    public int multiplication(int a, int b) {
        int result = a * b;
        return result;
    }

    public int division(int a, int b) {
        int result = a / b;
        return result;
    }



    public static void main(String[] args) {
        CalcWithReturntype obj= new CalcWithReturntype();
        int var=obj.addition(432,543);
        System.out.println("the sum of two number in addition is  "+var);

        int output=obj.substraction(456,332);
        System.out.println("the substraction of two number is  "+output);

        int guda =obj.multiplication(45,67);
        System.out.println("The value of two number in multipliatiom is  "+guda);

        int bhaag=obj.division(428,24);
        System.out.println("the bhaag of a number is  "+bhaag);
    }


}
