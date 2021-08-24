package javamethods;

public class Fridge {
    String name;
    int price;
    double quantity;

    //Brand, Price ,Quantity ,Trays etc //

    public void brand(){
        System.out.println("This is the Whirpool Brand fridge");
    }

    public void price(){
        System.out.println("The price of this fridge in above 40000+");

    }

    public void quantity(){
        System.out.println("The quamtity of this fridge is a 50litres ");

    }

    public void trays(){
        System.out.println("This fridge have 3 trays and 1 basket");

    }

    public static void main(String[] args) {
        Fridge obj = new Fridge();
        obj.brand();
        obj.price();
        obj.quantity();
        obj.trays();
    }


}
