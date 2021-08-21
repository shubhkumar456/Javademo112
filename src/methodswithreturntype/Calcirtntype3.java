package methodswithreturntype;

public class Calcirtntype3 {

    public double div(double a, double b, double c,double d){
        double out=a/b/c/d;
        return out;

    }

    public double multi(double a, double b, double c,double d){
        double out=a*b*c*d;
        return out;

    }

    public double subs(double a, double b, double c,double d){
        double out=a-b-c-d;
        return out;

    }

    public double add(double a, double b, double c,double d){
        double out=a+b+c+d;
        return out;

    }






    public static void main(String[] args) {
        Calcirtntype3 obj = new Calcirtntype3();
        double out= obj.div(20000.4,12.5,8.9,5.6);
        System.out.println("the sum of the the divisible no. is  "+out);

        double res =obj.multi(12.5,13.5,23.4,43.7);
        System.out.println("the value of multiple is  "+res);

        double var =obj.subs(23430.3,1000.4,2000.6,4000.8);
        System.out.println("the value of the three variable no. in multiple is"+var);

        double ans =obj.add(123.5,453.6,675.9,989.5);
        System.out.println("the sum of an addition in double method  "+ans);

    }
}
