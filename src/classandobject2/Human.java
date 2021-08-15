package classandobject2;

public class Human {
    String name;
    int payment;
    double budget;
    String style;

    public Human(String name, int payment, double budget, String style) {
        this.name = name;
        this.payment = payment;
        this.budget = budget;
        this.style = style;
    }

    public static void main(String[] args) {
        Human object = new Human("salman khan",80000000,300000000,"swagger");
        System.out.println(object.name);
        System.out.println(object.payment);
        System.out.println(object.style);
        System.out.println(object.budget);
    }
}
