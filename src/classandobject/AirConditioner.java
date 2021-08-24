package classandobject;

import java.awt.datatransfer.StringSelection;

public class AirConditioner {

    String name = "Lloyd AirConditioner";
    int unit = 2  ;
    double price =54000.56;
    String units = "2units INDOOR OR OUTDOOR";
    String warranty = "five years";

    public static void main(String[] args) {
        AirConditioner obj = new AirConditioner();

        System.out.println(obj.name);
        System.out.println(obj.unit);
        System.out.println(obj.price);
        System.out.println(obj.units);
        System.out.println(obj.warranty);

    }
}
