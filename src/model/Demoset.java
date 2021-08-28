package model;

import java.util.HashSet;

public class Demoset {

    public void demo(){

        HashSet <String> name = new HashSet<>();

        name.add("shubendra kumar");
        name.add("shubendra kumar");
        name.add("shubendra kumar");
        name.add("arun thakur");
        name.add("arun thakur");
        name.add("arun thakur");
        name.add("subodh kumar");
        name.add("subodh kumar");
        name.add("subodh kumar");

        for (String var : name){
            System.out.println("Printing name out of duplcates  :"+var);
        }

        HashSet<Integer> numset = new HashSet<>();

        numset.add(34);
        numset.add(55);
        numset.add(65);
        numset.add(78);
        numset.add(87);
        numset.add(78);
        numset.add(55);
        numset.add(34);

        for (Integer var : numset){
            System.out.println("Printing numset removes duplicates  :"+var);
        }

        HashSet<Double> deciset = new HashSet<>();

        deciset.add(55.5);
        deciset.add(67.5);
        deciset.add(55.5);
        deciset.add(60.0);
        deciset.add(67.5);
        deciset.add(78.0);
        deciset.add(60.0);
        deciset.add(55.0);

        for (Double var : deciset){
            System.out.println("Removes duplicates we have got this values  :"+var);
        }





    }

    public static void main(String[] args) {
        Demoset obj =new Demoset();
        obj.demo();
    }


}
