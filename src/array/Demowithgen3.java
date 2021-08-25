package array;

import java.util.ArrayList;

public class Demowithgen3 {

    public void demo(){

        ArrayList<String> brands = new ArrayList<>();

        brands.add("Vivo Mobiles India");
        brands.add("Oppo Mobile India");
        brands.add("Nokia Made from Taiwan");
        brands.add("One Plus+ ");
        brands.add("Apple IPHONE Series");

        for (String var :brands){
            System.out.println("Here are some brands in mobile phones  :-"+var);
        }

        ArrayList<Integer> units = new ArrayList<>();

        units.add(03);
        units.add(02);
        units.add(05);
        units.add(01);

        for (Integer var : units){
            System.out.println("Here are some units in mobiles  :-"+var);

        }

        ArrayList<Double> price = new ArrayList<>();

        price.add(17499.50);
        price.add(24550.70);
        price.add(32550.89);
        price.add(15999.90);
        price.add(42299.20);

        for (Double var : price){
            System.out.println("Here are some prices of different models  :-"+var);
        }




    }

    public static void main(String[] args) {
        Demowithgen3 obj = new Demowithgen3();
        obj.demo();
    }
}
