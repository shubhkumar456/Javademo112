package revision;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

    public void demo() {

        List name = new ArrayList();

        name.add("My name is Steve Smith");
        name.add("My name is Charles Smith");
        name.add("My name is Andrew Symond");
        name.add("My name is Peter Parker");
        name.add("My name is Logan ");
        name.add("My name is Jeepers Creepers");

        System.out.println(name.get(0));
        System.out.println(name.get(1));

        System.out.println("Printing Some Name Using Get  "+name.get(5));
        System.out.println("Printing Some Name Using Get  "+name.get(4));
        System.out.println("Printing Some Name Using Get  "+name.get(3));
        System.out.println("Printing Some Name Using Get  "+name.get(2));
        System.out.println("Printing Some Name Using Get  "+name.get(1));
        System.out.println("Printing Some Name Using Get  "+name.get(0));


        name.remove(5);
        name.remove(4);
        name.remove(3);

        for(Object var : name){
            System.out.println("Getting Result After Remove Some Names  "+var);
        }

    }

    public void demo1(){

        List Integer = new ArrayList();

        Integer.add(5148362);
        Integer.add(518375);
        Integer.add(50);
        Integer.add(48);
        Integer.add(90);

        System.out.println(Integer.get(0));
        System.out.println(Integer.get(1));
        System.out.println(Integer.get(2));
        System.out.println(Integer.get(3));

        System.out.println("Printing index:- "+Integer.get(0));
        System.out.println("Printing index:- "+Integer.get(1));
        System.out.println("Printing index:- "+Integer.get(2));
        System.out.println("Printing index:- "+Integer.get(3));
        System.out.println("Printing index:- "+Integer.get(4));

        Integer.remove(0);
        Integer.remove(1);
        Integer.remove(2);

        for (Object value : Integer){
            System.out.println("After removing some numbers  :-"+value);
        }
    }

    public void main(){

        List mobile = new ArrayList();

        mobile.add("Vivo Mobile India ");
        mobile.add("Oppo Mobile India ");
        mobile.add("OnePlus Mobile India ");
        mobile.add("IPhone Mobile America ");
        mobile.add("Lenovo Mobile India ");
        mobile.add("Samsung Mobile India ");
        mobile.add("Noia Mobile Taiwan ");

        System.out.println(mobile.get(0));
        System.out.println(mobile.get(2));
        System.out.println(mobile.get(4));


        mobile.add("Printing Some Mobile names :-"+mobile.get(0));
        mobile.add("Printing Some Mobile names :-"+mobile.get(1));
        mobile.add("Printing Some Mobile names :-"+mobile.get(2));
        mobile.add("Printing Some Mobile names :-"+mobile.get(3));
        mobile.add("Printing Some Mobile names :-"+mobile.get(4));
        mobile.add("Printing Some Mobile names :-"+mobile.get(5));
        mobile.add("Printing Some Mobile names :-"+mobile.get(6));


        mobile.remove(0);
        mobile.remove(1);
        mobile.remove(2);
        mobile.remove(6);

        for(Object brands : mobile){
            System.out.println("After removing some brands we get this :-"+brands);
        }


    }


    public static void main(String[] args) {
        Arraylist obj = new Arraylist();
        obj.demo();
        obj.demo1();
        obj.main();
    }
}
