package inheritance;

public class Child3 extends Parent3 {

    public void demo(){

        System.out.println("My name is shubendra kumar his son");
        System.out.println("I do my inter study in Tundla ");
        System.out.println(" and complete my graduation in Agra ");

    }

    public static void main(String[] args) {
        Child3 obj = new Child3();
        obj.demo();

        Parent3 object = new Parent3();
        object.demo();

    }
}
