package javamethods2;

public class Calcrepeat2 {

    public void add(){

        double a= 123233.4;
        double b= 23313.6;
        double result = a+b;
        System.out.println("there is the result of the doubles in addition :-"+result);
    }

    public void multi(){

        double a= 123.4;
        double b= 233.6;
        double result = a*b;
        System.out.println("there is the result of the doubles in multiplication :-"+result);
    }

    public void subs(){

        double a= 198733.4;
        double b= 53313.6;
        double result = a-b;
        System.out.println("there is the result of the doubles in substrsaction :-"+result);
    }

    public void division(){

        double a= 23233.4;
        double b= 313.6;
        double result = a/b;
        System.out.println("there is the result of the doubles in division :-"+result);
    }










    public static void main(String[] args) {
        Calcrepeat2 obj = new Calcrepeat2();
        obj.add();
        obj.multi();
        obj.subs();
        obj.division();
    }
}
