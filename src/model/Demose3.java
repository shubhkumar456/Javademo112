package model;

import java.util.HashSet;

public class Demose3 {

    public void demo(){

        HashSet<String> name = new HashSet<>();


        name.add("java");
        name.add("java");
        name.add("Springboot");
        name.add("Springboot");
        name.add("compiler");
        name.add("compiler");
        name.add("computer");
        name.add("computer");

        for (String var : name){
            System.out.println("Printing elemnets  :"+var);
        }

        name.remove(0);
        name.remove(2);

        for (String inp : name){
            System.out.println("Printing elemnets after removing :"+inp);
        }





    }

    public static void main(String[] args) {
        Demose3 obj = new Demose3();
        obj.demo();
    }
}
