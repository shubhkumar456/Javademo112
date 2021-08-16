package javamethods;

public class Smarttv {
    String name;
    int remote;
    double price;

    /*brand,android,mouse,internet*/

    public void brand(){
        System.out.println("this is a mitashi brand smarttv");
    }
    public void android(){
        System.out.println("smarttv has inbuilt android like mobile");
    }
    public void mouse(){
        System.out.println("it contains two remote first one is normal second one is air mouse");
    }
    public void internet(){
        System.out.println("why it is called smarttv because we can use interet on tv like youtube,facebook etc.");
    }

    public static void main(String[] args) {
        Smarttv obj =new Smarttv();
           obj.mouse();
           obj.internet();
           obj.brand();
           obj.android();

    }
}
