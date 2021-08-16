package classandobject;

public class Book {
    String name="2states";
    int pages=300;
    String writer="Chetan Bhagat";
    double price=249.5;

    public static void main(String[] args) {
        Book obj= new Book();
        System.out.println(obj.name);
        System.out.println(obj.pages);
        System.out.println(obj.writer);
        System.out.println(obj.price);
    }
}
