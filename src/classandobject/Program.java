package classandobject;

public class Program {

    String language ;
    String ide ;
    int price ;

    public Program(String language, String ide, int price) {
        this.language = language;
        this.ide = ide;
        this.price = price;
    }

    public static void main(String[] args) {
        Program obj = new Program("Java","Intellij Idea",100000);
        System.out.println(obj.language);
        System.out.println(obj.ide);
        System.out.println(obj.price);

        Program obj1 = new Program("Spring","Eclipse",1200000);
        System.out.println(obj1.language);
        System.out.println(obj1.ide);
        System.out.println(obj1.price);

        Program obj2 = new Program("SpringBoot","Intellij Community",200000);
        System.out.println(obj2.language);
        System.out.println(obj2.ide);
        System.out.println(obj2.price);
    }
    //    public static void main(String[] args) {
//        Program obj = new Program();
//
//        System.out.println(obj.language);
//        System.out.println(obj.ide);
//        System.out.println(obj.price);
//
//        Program obj1 = new Program();
//        System.out.println(obj1.language);
//        System.out.println(obj1.ide);
//        System.out.println(obj1.price);
//
//    }

}
