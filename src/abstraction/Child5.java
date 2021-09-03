package abstraction;

public class Child5 extends Abstract5{
    @Override
    public void demo() {
        System.out.println("chini kam");
        System.out.println("jani dushman");

        }

    public void demo2(){
        System.out.println("jeena yaha marna yaha");
        System.out.println("ramjaane");
    }

    public void demo3(){
        System.out.println("ramleela");
        System.out.println("rajneeti");
    }

    public static void main(String[] args) {
        Child5 obj = new Child5();
        obj.demo();
        obj.demo2();
        obj.demo3();
        obj.m1();
        obj.m2();
        obj.m3();
    }



}

