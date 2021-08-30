package model;

import javax.security.sasl.SaslServer;
import java.util.HashMap;

public class Hashdemo {

    public void main(){

        HashMap <Integer,String> Name = new HashMap();

        Name.put(1,"Shubendra kumar");
        Name.put(2,"Subodh kumar");
        Name.put(3,"Gulshan kumar");
        Name.put(4,"Arun Singh");

        System.out.println("we get this :"+Name.get(1));
        System.out.println("we get this :"+Name.get(3));
        System.out.println("we get this :"+Name.get(4));


        HashMap<String, String> cityname = new HashMap<>();

        cityname.put("a","Tundla");
        cityname.put("b","Agra");
        cityname.put("c","Rishikesh");
        cityname.put("d","Neelkanth");
        cityname.put("e","Dehradun");

        System.out.println("we get this :"+cityname.get("c"));
        System.out.println("we get this :"+cityname.get("d"));
        System.out.println("we get this :"+cityname.get("e"));





    }

    public static void main(String[] args) {
        Hashdemo obj = new Hashdemo();
        obj.main();
    }
}
