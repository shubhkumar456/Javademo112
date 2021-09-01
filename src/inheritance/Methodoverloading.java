package inheritance;

public class Methodoverloading {

    public void m1(){

        System.out.println("This is m1 method with no parameters");

    }

    public void m1(int a){

        System.out.println("This is m1 method with  parameters integer");

    }

    public void m1(double a){

        System.out.println("This is m1 method with double parameters");

    }

    public void m1(String a){

        System.out.println("This is m1 method with String parameters");

    }

    public static void main(String[] args) {

        Methodoverloading obj = new Methodoverloading();
        obj.m1();
        obj.m1(33);
        obj.m1(55.0);
        obj.m1("Shubendra Kumar");
    }



}
