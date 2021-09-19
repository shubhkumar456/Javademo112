package javamethods;

public class Printer {
    String name;
    int buttons;
    double price;
    String type;


    public void name(){
        System.out.println("The name of the printer i am using is HP LaserJet M1136 ");
    }

    public void buttons(){
        System.out.println("This printer have six numbers of buttons");
    }

    public void price(){
        System.out.println("The price of this printer is 14550.0 only");
    }

    public void type(){
        System.out.println("The type of this computer is blacknwhite it works on electricity");
    }

    public static void main(String[] args) {
        Printer obj = new Printer();
        obj.name();
        obj.buttons();
        obj.price();
        obj.type();
    }


}
