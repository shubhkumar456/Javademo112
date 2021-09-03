package abstraction;

public class Child4 extends Abstract4{
    @Override
    public void demo() {

        System.out.println("the first game is have played");
        System.out.println("the name of the game is super mario");

        }
    public void mod1(){
        System.out.println("the second game played");
        System.out.println("the name of the game that is played is contra");

    }

    public void mod2(){
        System.out.println("in ps i have the first game");
        System.out.println("the name is tekken three");

    }

    public static void main(String[] args) {
        Child4 obj = new Child4();
        obj.demo1();
        obj.demo2();
        obj.demo3();
        obj.demo();
        obj.mod1();
        obj.mod2();
    }


}

