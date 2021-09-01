package inheritance;

public class Child2 extends Parents2{

    public void demo(){

        System.out.println("Iam his son aarav kumar");
        System.out.println("Iam his daughter kumari zoyi");
    }

    public static void main(String[] args) {

        Child2 obj = new Child2();
        obj.demo();

        Parents2 object = new Parents2();
        object.demo();
    }
}
