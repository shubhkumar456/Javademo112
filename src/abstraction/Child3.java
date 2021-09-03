package abstraction;

public class Child3 extends Abstract3{
    @Override
    public void demo() {
        System.out.println("Hello my name is natasha ");
        System.out.println("Also called me a black widow");
    }

    public void demo1(){
        System.out.println("Hello sir iam peter parker");
        System.out.println("People know me as a spider man");
    }

    public void demo2(){
        System.out.println("Hello my name is jonathan");
        System.out.println("Iam in the wrath of the man");
    }

    public void demo3(){
        System.out.println("Or ha hain Loki ");
        System.out.println("shararato ke devta");
    }

    public static void main(String[] args) {
        Child3 obj = new Child3();
        obj.demo();
        obj.demo1();
        obj.demo2();
        obj.demo3();
        obj.a1();
        obj.a2();
        obj.a3();
    }
}
