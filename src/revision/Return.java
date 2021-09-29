package revision;

public class Return {

    public String demo(String msg){
        String brand =" Vivo Made In "+msg;
        return brand;
    }

    public String name(String Software){
        String company = "The microsoft company is launch a new software that is "+Software;
        return company;
    }

    public String message(String msg){
        String message = "Welcome to the world of "+msg;
        return message;
    }

    public int mode(){
        return 24;

    }

    public double salary(){
        return 56999.9;
    }

    public int income(){
        return 60000;
    }

    public String Apple(String msg){
        String detail ="The American comoany of this phone is "+msg;
        return detail;
    }

    public String Bike(String msg){
        String nope= "I have Three Bikes and One Car The name of the car is "+msg;
        return nope;

    }

    public String demo(){
        String name ="Hello ";
        return name;

    }

    public String demo2(){
        String message = "The day I didn't forget the they jokes on me, the joke is i didn't buy a car";
        return message;
    }

    public String savage(){
        String Val = "The man save his life to the lion";
        return Val;
    }

    public String save(){
        String detail ="We can save all the projects what you have done in the java or anything we can save it in the github ";
        return detail;
    }

    public static void main(String[] args) {
        Return obj = new Return();

        String out = obj.savage();
        System.out.println(out+"or he will saved by him");

        String bar = obj.demo();
        System.out.println(bar+" world");

        String detail= obj.Bike("Volkswagen Polo, and the bikes is Honda Activa, Yamaha R15 V3,");
        System.out.println(detail);

        String Val = obj.Apple("IPhone, Beetle, Xongchi ");
        System.out.println(Val);

        String var = obj.demo("India");
        System.out.println(var);

        String val = obj.name("Cortana");
        System.out.println(val);

        String msg = obj.message("Core Java");
        System.out.println(msg);

        int old = obj.mode();
        System.out.println("My age is "+old);

        double income = obj.salary();
        System.out.println("My Monthly  is :-"+income);

        int dep = obj.income();
        System.out.println("My Monthly income is :"+dep);

        String memory = obj.demo2();
        System.out.println(memory+" I do not forget the words that they both told me because when iam thinking they remind me again and again every time ");

        String print = obj.save();
        System.out.println(print+" there are several apps to save the project but git hub is the best");
    }
}
