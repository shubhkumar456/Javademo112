package listTraversre;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Trsverse {
    public static void main(String[] args) {
        List<String> liststr = new ArrayList<>();
        liststr.add("John");
        liststr.add("Shyam");
        liststr.add("Ram");
        liststr.add("Peter");

        //Simple loop;
        // Start from 0, end size-1;
        // we can use this loop for Index collection

        for (int i=0; i<=liststr.size()-1; i++){
            System.out.println(liststr.get(i));
        }

        System.out.println("+++++++++++++++++++++");

        //for each
        //we can use this loop in any collection

        for (String str: liststr){
            System.out.println(str);
        }
        System.out.println("****************************");

        //using Iterator :: almost used in all collection in forward;

        Iterator<String> itr = liststr.iterator();
        while (itr.hasNext()){
            String elemrnt = itr.next();
            System.out.println(elemrnt);
        }
        System.out.println("+++++++++++Iterator+++++++++++++++");
    }


}
