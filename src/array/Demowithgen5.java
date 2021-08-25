package array;

import java.util.ArrayList;

public class Demowithgen5 {

    public void demo(){

        ArrayList <Double> price = new ArrayList<>();

        price.add(7000.0);
        price.add(3500.0);
        price.add(14000.0);
        price.add(17000.0);
        price.add(29999.0);

        for(Double output: price){
            System.out.println("This is the series of my purchase mobiles  : "+ output);
        }


        ArrayList <Integer> sales= new ArrayList<>();

        sales.add(12);
        sales.add(15);
        sales.add(18);
        sales.add(22);
        sales.add(30);

        for (Integer var : sales){
            System.out.println("Units of some sailing parts  :- "+var);

        }

        ArrayList <String> company = new ArrayList<>();

        company.add("Reliance");
        company.add("Indian Oil");
        company.add("Bharat Petroleum");
        company.add("Hndustan Petroleum");
        company.add("Essar");

        for (String var : company){
            System.out.println("Here are some Petroleum companies  :- "+var);
        }
    }

    public static void main(String[] args) {
        Demowithgen5 obj = new Demowithgen5();
        obj.demo();
    }
}
