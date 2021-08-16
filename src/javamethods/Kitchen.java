package javamethods;

public class Kitchen {
    String name;
    int unit;
    double price;
    /*cooking,washing,lighting,oven*/
    public void cooking(){
        System.out.println("we can use kitchen for cooking ");
    }
    public void washing(){
        System.out.println(" we can use dish washer to wash vessels in kitchen");
    }
    public void lighting(){
        System.out.println("there was good lighting in the kitchen");
    }
    public void oven(){
        System.out.println("we can use oven for fast coking");
    }

    public static void main(String[] args) {
        Kitchen obj = new Kitchen();
          obj.cooking();
          obj.lighting();
          obj.washing();
          obj.oven();
    }



}
