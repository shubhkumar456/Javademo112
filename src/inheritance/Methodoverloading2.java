package inheritance;

public class Methodoverloading2 {

    public void m1(){

        System.out.println("This is m1 method with no parameters");

    }

    public void m1(int age, String name){

        System.out.println("This is m1 method with integer or String parameters");

    }

    public void m1(Double salary, String company){

        System.out.println("This company is give me a salary of rupees");

    }

    public void m1(int a ,int b){

        System.out.println("This is m1 method with multiple integers parameters");

    }

    public void m1(double a, double b){

        System.out.println("This is m1 method with multiple doubles parameters");

    }

    public void m1(String a, String b){

        System.out.println("This is m1 method with multiple strings parameters");

    }

    public static void main(String[] args) {

        Methodoverloading2 obj = new Methodoverloading2();
        obj.m1();
        obj.m1(22,33);
        obj.m1(24,"Shubendra kumar");
        obj.m1(55000.0,"Microsoft");
        obj.m1(11.0,22.0);
        obj.m1("Gulshan Kumar","B.TECH");
    }







}
