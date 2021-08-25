package array;

import java.util.ArrayList;

public class Demowithgen2 {

    public void demo(){

        ArrayList <Double> pointvalues = new ArrayList<>();

        pointvalues.add(55.6);
        pointvalues.add(67.7);
        pointvalues.add(89.9);
        pointvalues.add(91.4);
        pointvalues.add(80.5);

        for (Double var : pointvalues){
            System.out.println(var);
        }

        ArrayList <Integer> price = new ArrayList<>();

        price.add(3599);
        price.add(3899);
        price.add(1899);
        price.add(2599);
        price.add(2899);

        for (Integer rupees : price ){
            System.out.println( rupees);
        }

        ArrayList <String> brands = new ArrayList();

        brands.add("Puma mens nash running shoes");
        brands.add("HRX soft foam running shoes");
        brands.add("Nike sneakers shoes");
        brands.add("Nike Air Jordan shoes");
        brands.add("Woodland  shoes for men");

        for (String company : brands){
            System.out.println(company);
        }
    }


    public static void main(String[] args) {
        Demowithgen2 obj = new Demowithgen2();
        obj.demo();
    }
}
