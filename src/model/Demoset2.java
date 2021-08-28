package model;

import java.util.HashSet;

public class Demoset2 {

    public void demo(){

        HashSet<Integer> num = new HashSet<>();

        num.add(12);
        num.add(21);
        num.add(12);
        num.add(21);
        num.add(22);
        num.add(25);

        for (Integer var : num){
            System.out.println("Printing numbers  :"+var);
        }

        HashSet<Double> nums = new HashSet<>();

        nums.add(33.3);
        nums.add(22.2);
        nums.add(22.2);
        nums.add(33.3);
        nums.add(44.4);
        nums.add(55.5);

        for( Double var : nums){
            System.out.println("Printing  :" +var);

        }

        HashSet<String> names = new HashSet<>();

        names.add("java");
        names.add("javascript");
        names.add("bootspring");
        names.add("java");
        names.add("javascript");
        names.add("commercials");

        for (String var :names){
            System.out.println("Printing without duplicates  :"+var);
        }

    }

    public static void main(String[] args) {
        Demoset2 obj = new Demoset2();
        obj.demo();
    }
}
