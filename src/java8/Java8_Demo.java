package java8;

public class Java8_Demo {
    final static String str="Hello ";

    public static void main(String[] args) {
        GreetingService greetser= message ->
                System.out.println(str + message);
        greetser.sayMessage("Mahesh");
    }
    interface GreetingService{
        void sayMessage(String message);
    }
}
