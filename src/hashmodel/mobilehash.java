package hashmodel;

import models.Mobiles;

import java.util.HashMap;

public class mobilehash {

    public void main(){

        HashMap<Integer, Mobiles> specs = new HashMap<>();

        Mobiles m1 = new Mobiles("One Plus",8,256,56699.0);
        Mobiles m2 = new Mobiles("Iphone",8,256,86699.0);
        Mobiles m3 = new Mobiles("Vivo X60",16,256,66699.0);
        Mobiles m4 = new Mobiles("Samsung z1Plus",32,512,96699.0);

        specs.put(1,m1);
        specs.put(2,m2);
        specs.put(3,m3);
        specs.put(4,m4);

        Mobiles m = specs.get(1);
        System.out.println(m.getBrand());
        System.out.println(m.getRam());
        System.out.println(m.getRom());
        System.out.println(m.getPrice());

        m = specs.get(2);
        System.out.println(m.getBrand());
        System.out.println(m.getRam());
        System.out.println(m.getRom());
        System.out.println(m.getPrice());

        m = specs.get(3);
        System.out.println(m.getBrand());
        System.out.println(m.getRam());
        System.out.println(m.getRom());
        System.out.println(m.getPrice());

        m = specs.get(4);
        System.out.println(m.getBrand());
        System.out.println(m.getRam());
        System.out.println(m.getRom());
        System.out.println(m.getPrice());

    }

    public static void main(String[] args) {
        mobilehash obj = new mobilehash();
        obj.main();
    }
}
