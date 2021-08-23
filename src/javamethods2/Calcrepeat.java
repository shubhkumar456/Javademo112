package javamethods2;

public class Calcrepeat {

    public void add(){
        int a=657;
        int b=890;
        int result =a+b;
        System.out.println("There is the result of the addition  :-"+result);
    }

    public void subs(){
        int a=6157;
        int b=890;
        int result =a-b;
        System.out.println("There is the result of the substraction  :-"+result);
    }

    public void multi(){
        int a=65;
        int b=89;
        int result =a*b;
        System.out.println("There is the result of the multiplication  :-"+result);
    }

    public void div(){
        int a=6527;
        int b=89;
        int result =a/b;
        System.out.println("There is the result of the division  :-"+result);
    }

    public void addi( int a, int b,int c,int d,int e){

        int result = (a+b+c+d+e);
        System.out.println("This is the answer of addition in multiples  +"+result);

    }

    public void guna( int a, int b,int c,int d,int e){

        int result = (a*b*c*d*e);
        System.out.println("This is the answer of guna in multiples  +"+result);

    }

    public void sub( int a, int b,int c,int d,int e){

        int result = (a-b-c-d-e);
        System.out.println("This is the answer of substraction in multiples  +"+result);

    }

    public void bhag( int a, int b,int c,int d,int e){

        int result = (a/b/c/d/e);
        System.out.println("This is the answer of division in multiples  +"+result);

    }
    public void plus(double a,double b,double c,double d,double e){
        double result = a+b+c+d+e;
        System.out.println("This is the answer of addition in multiples  "+result);

    }

    public void minus(double a,double b,double c,double d,double e){
        double result = a-b-c-d-e;
        System.out.println("This is the answer of substraction in multiples  "+result);

    }

    public void guna(double a,double b,double c,double d,double e){
        double result = a*b*c*d*e;
        System.out.println("This is the answer of multiplication in multiples  "+result);

    }

    public void bhaga(double a,double b,double c,double d,double e){
        double result = a/b/c/d/e;
        System.out.println("This is the answer of division in multiples  "+result);

    }











    public static void main(String[] args) {
        Calcrepeat obj = new Calcrepeat();
        obj.add();
        obj.subs();
        obj.multi();
        obj.div();

        obj.addi(12,23,45,34,65);
        obj.guna(11,22,33,44,55);
        obj.sub(2000,230,332,211,332);
        obj.bhag(10000,11,8,5,4);

        obj.plus(23.7,231.2,323.1,121.3,212);
        obj.minus(2500.4,122.1,211.2,311.1,99.8);
        obj.guna(11.1,12.3,55.2,23.4,55.8);
        obj.bhaga(12500.0,8.5,9.5,10.6,12.5);


    }
}
