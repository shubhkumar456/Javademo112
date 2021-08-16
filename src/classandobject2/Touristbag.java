package classandobject2;

public class Touristbag {
    String brand;
    int capacity;
    double price;
    int lock;

    public Touristbag(String brand, int capacity, double price, int lock) {
        this.brand = brand;
        this.capacity = capacity;
        this.price = price;
        this.lock = lock;

    }

    public static void main(String[] args) {
        Touristbag obj =new Touristbag("american tourister",30,4999.5,2);
        System.out.println(obj.brand);
        System.out.println(obj.capacity);
        System.out.println(obj.price);
        System.out.println(obj.lock);
    }
}
