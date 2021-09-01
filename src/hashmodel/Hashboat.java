package hashmodel;

import models.Boat;

import java.util.HashMap;

public class Hashboat {

    public void product(){

        HashMap <Integer, Boat> hashboat = new HashMap<>();

        Boat boat = new Boat("Boat ",05,"earphones,",2599.0);
        Boat boat2 = new Boat("Boat ",04,"bluetooth head phones,",4000.0);
        Boat boat3 = new Boat("Boat ",02,"smartwatch,",3500.0);
        Boat boat4 = new Boat("Boat ",03,"charging cables,",400.0);

        hashboat.put(1,boat);
        hashboat.put(2,boat2);
        hashboat.put(3,boat3);
        hashboat.put(4,boat4);

        Boat boats =hashboat.get(1);
        System.out.println(boats.getBrand());
        System.out.println(boats.getVarities());
        System.out.println(boats.getTypes());
        System.out.println(boats.getPrice());

        boats =hashboat.get(2);
        System.out.println(boats.getBrand());
        System.out.println(boats.getVarities());
        System.out.println(boats.getTypes());
        System.out.println(boats.getPrice());

        boats =hashboat.get(3);
        System.out.println(boats.getBrand());
        System.out.println(boats.getVarities());
        System.out.println(boats.getTypes());
        System.out.println(boats.getPrice());

        boats =hashboat.get(4);
        System.out.println(boats.getBrand());
        System.out.println(boats.getVarities());
        System.out.println(boats.getTypes());
        System.out.println(boats.getPrice());



    }

    public static void main(String[] args) {
        Hashboat obj = new Hashboat();
        obj.product();
    }
}
