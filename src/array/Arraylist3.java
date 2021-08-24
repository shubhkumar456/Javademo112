package array;

import java.util.ArrayList;
import java.util.List;

public class Arraylist3 {

    public void demo(){

        List age = new ArrayList();



        age.add("My Name Is Shubendra, my age is ="+23);
        age.add("My brother age is ="+25);
        age.add("My sister age is ="+36);
        age.add("My uncle  age is = "+43);
        age.add("My father age is ="+60);

        System.out.println("Getting inside the box this variable  "+age.get(0));
        System.out.println("Getting inside the box this variable  "+age.get(2));
        System.out.println("Getting inside the box this variable  "+age.get(4));

        for (Object var : age){
            System.out.println(var);

        }

        age.remove(4);
        for (Object var : age){
            System.out.println( "After removing index four we get this variables  ="+var);

        }


    }

    public static void main(String[] args) {
        Arraylist3 obj = new Arraylist3();
        obj.demo();
    }
}
