package javamethods2;

public class Calwithparams {

    public void add(double a,double b,double c,double d){
        double result = a+b+c+d;
        System.out.println("the sum of the numbers is :-"+result);

    }

    public void sub(double a,double b, double c,double d){
        double result = a-b-c-d;
        System.out.println("the sum of the numbers is :-"+result);
    }

    public void multi(double a,double b,double c,double d){
        double result = a*b*c*d;
        System.out.println("the sum of the numbers is :-"+result);
    }

    public void div(double a, double b,double c,double d){
        double result = a/b/c/d;
        System.out.println("the sum of the numbers is :-"+result);
    }

    public static void main(String[] args) {
        Calwithparams obj = new Calwithparams();
        obj.add(10.0,20.0,30.0,40.0);
        obj.sub(1000.0,20.0,30.0,40.0);
        obj.multi(40.0,50.0,60.0,70.0);
        obj.div(40000.0,20.0,30.0,40.0);
    }
}
