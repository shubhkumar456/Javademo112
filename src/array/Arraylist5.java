package array;

import java.util.ArrayList;

public class Arraylist5 {

    public void demo(){

        ArrayList rollno = new ArrayList();

        rollno.add(55);
        rollno.add(67);
        rollno.add(34);
        rollno.add(01);
        rollno.add(32);


        System.out.println("After getting some students  rollno's  :"+(rollno.get(4)));
        System.out.println("After getting some students  rollno's  :"+(rollno.get(0)));
        System.out.println("After getting some students  rollno's  :"+(rollno.get(3)));

        for (Object var :rollno){
            System.out.println("Here are some rollno in nursery to eighth classes   :-"+var);
        }

        rollno.remove(4);
        rollno.remove(0);

        for (Object var : rollno){
            System.out.println("After removing two students we get this  :"+var);
        }
    }

    public static void main(String[] args) {
        Arraylist5 obj = new Arraylist5();
        obj.demo();
    }
}
