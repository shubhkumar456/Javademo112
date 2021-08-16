package classandobject;

public class Java {
    String name;
    int student;
    double fees;
    int number;

    public Java(String name, int student, double fees, int number) {
        this.name = name;
        this.student = student;
        this.fees = fees;
        this.number = number;
    }

    public static void main(String[] args) {
        Java object = new Java("java software",30,20000.4,32);
        System.out.println(object.name);
        System.out.println(object.student);
        System.out.println(object.fees);
        System.out.println(object.number);

    }
}
