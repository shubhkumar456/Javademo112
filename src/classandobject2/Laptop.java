package classandobject2;

public class Laptop {
    String brand;
    String processor;
    int ram;
    double price;
    int harddisk;

    public Laptop(String brand, String processor, int ram, double price, int harddisk) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.price = price;
        this.harddisk = harddisk;
    }

    public static void main(String[] args) {
        Laptop object = new Laptop("acer","intel",8,75000.5,1024);

        System.out.println(object.brand);
        System.out.println(object.processor);
        System.out.println(object.ram);
        System.out.println(object.price);
        System.out.println(object.harddisk);

    }
}
