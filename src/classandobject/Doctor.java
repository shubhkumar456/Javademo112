package classandobject;

public class Doctor {
    int fees =2000;
    String hospital="apollo hospital";
    int staff= 500;
    double price= 32000.2;

    public static void main(String[] args) {
        Doctor object = new Doctor();
        System.out.println(object.hospital);
        System.out.println(object.price);
        System.out.println(object.staff);
        System.out.println(object.fees);

            Doctor object1 = new Doctor();
        System.out.println(object1.hospital);
        System.out.println(object1.price);
        System.out.println(object1.staff);
        System.out.println(object1.fees);
    }


}
