package abstraction;

public class Child2 extends Abstractdemo2{

    @Override
    public void demo(){
        System.out.println("My favourite food is Biryani");
        System.out.println("Chicken Biryani");
    }

    public void demo2(){
        System.out.println("Tu jaane na ");
        System.out.println("Aajao meri tamanna");
    }

    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.demo();
        obj.demo2();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
