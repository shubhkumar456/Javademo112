package classandobject2;

public class Speaker {
    String brand;
    double price;
    int unit;
    int speaker;

    public Speaker(String brand, double price, int unit, int speaker) {
        this.brand = brand;
        this.price = price;
        this.unit = unit;
        this.speaker = speaker;

    }

    public static void main(String[] args) {
        Speaker obj = new Speaker("mitashi",28990.5,2,8);
        System.out.println(obj.brand);
        System.out.println(obj.price);
        System.out.println(obj.unit);
        System.out.println(obj.speaker);
    }
}
