package abstraction;

public class Abstract implements DemoInterference {
    @Override
    public void demo() {
        System.out.println("Hello world");

    }

    @Override
    public void demo1() {
        System.out.println("I lived in Tundla");

    }

    @Override
    public void demo2() {
        System.out.println("Do you think iam mad");


    }

    @Override
    public void demo3() {
        for(int i=0; i<=10; i++){
            System.out.println("Hello miss :"+i);
        }

    }

    public static void main(String[] args) {
        Abstract obj = new Abstract();
        obj.demo();
        obj.demo1();
        obj.demo2();
        obj.demo3();
    }
}
