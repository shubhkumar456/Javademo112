package abstraction;

public class Child extends Abstractdemo{

    @Override
    public void demo() {
        System.out.println("this child is very angry");

    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.demo();
        obj.m1();

    }
}
