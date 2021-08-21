package methodswithreturntype;

public class Returntype2 {

    public String brand( String a, String b, String c, String d){
        String result =(a+b+c+d);
        return result;

    }

    public String Human( String a, String b, String c, String d){
        String result =(a+b+c+d);
        return result;

    }

    public static void main(String[] args) {
        Returntype2 obj =new Returntype2();
        String brand= obj.brand("vivo    ",  "one plus     ",   "iphone     ",    "moto razer");
        System.out.println("there are some various brands of mobile phones    "+brand);

        String result=obj.Human("Name= Shubendra Kumar      " ,"Occupation= Software Engineer   ","Designation= Tundla    ","Posting= Bangalore");
        System.out.println("Here are some various detail about human     ="+result);
    }
}
