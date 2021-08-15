package classandobject2;

public class Tution {
    String name;
    int fees;
    int student;
    double bill;

    public Tution(String name, int fees, int student, double bill) {
        this.name = name;
        this.fees = fees;
        this.student = student;
        this.bill = bill;
    }

    public static void main(String[] args) {
        Tution object = new Tution("paramount",2000,10000,5000.5);
        System.out.println(object.name);
        System.out.println(object.student);
        System.out.println(object.fees);
        System.out.println(object.bill);
    }
}
