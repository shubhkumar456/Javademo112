package array;

import java.util.ArrayList;

public class Arraylist4 {

    public void demo(){

        ArrayList opt = new ArrayList();

        opt.add("john connor");
        opt.add("arnold tx800");
        opt.add("sarah connor");
        opt.add("katherine brooster");
        opt.add("john walker");


        System.out.println("list we get this  :"+(opt.get(1)));
        System.out.println("list we get this  :"+(opt.get(0)));
        System.out.println("list we get this  :"+(opt.get(2)));
        System.out.println("list we get this  :"+(opt.get(3)));

        for(Object var : opt ){
            System.out.println("here are some movies characters  :"+var);
        }

        opt.remove(3);
        opt.remove(0);
        for(Object var : opt ){
            System.out.println("here are some movies characters after removing some names  :"+var);
        }





    }

    public static void main(String[] args) {
        Arraylist4 obj = new Arraylist4();
        obj.demo();

    }
}
