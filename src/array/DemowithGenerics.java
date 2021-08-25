package array;

import java.util.ArrayList;

public class DemowithGenerics {

    public void demo(){

        ArrayList <String> listname = new ArrayList();

        listname.add("This message is for ");
        listname.add("Mr. Shubendra Kumar");
        listname.add("We have inform you that");
        listname.add("You are selected in UP police ");
        listname.add("For the post of SI ");
        listname.add("So we have congratulate you for this");


        ArrayList<Integer> values= new ArrayList<Integer>();

        values.add(512);
        values.add(1024);
        values.add(2048);
        values.add(4096);
        values.add(8192);
        values.add(16384);

        ArrayList<Double> decimalvalue = new ArrayList<Double>();

        decimalvalue.add(890.5);
        decimalvalue.add(650.6);
        decimalvalue.add(540.8);
        decimalvalue.add(990.6);
        decimalvalue.add(320.1);
        decimalvalue.add(230.4);

        for(String var : listname){
            System.out.println("Message for Mr.Shubendra Kumar   "+var);
        }

        for (Integer var : values){
            System.out.println("this is how the space  shown in all drives in the form of GB's :-"+var);

        }

        for (Double inputs : decimalvalue){
            System.out.println("There are some decimal values  :-"+inputs);
        }



    }

    public static void main(String[] args) {
        DemowithGenerics obj = new DemowithGenerics();
        obj.demo();
    }
}
