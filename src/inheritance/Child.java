package inheritance;

public class Child extends Parents{

    public void demo(){

        System.out.println("This is the Child methods");
        System.out.println("This is the Child2 methods");

    }

    public static void main(String[] args) {

        Child obj = new Child();
        obj.demo();

        Parents object = new Parents();
        object.demo();

    }


}
