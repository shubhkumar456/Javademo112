package javamethods;

public class Mobile {
    String name;
    int ram;
    double price;
    int rom;
    /*name,work,camera,music*/
    public void name(){
        System.out.println("iam using vivo brand mobile");
    }
    public void work(){
        System.out.println("this phone is very useful to store data");
    }
    public void camera(){
        System.out.println("this phone gives you the best quality camera pixel does not fluctuate");
    }
    public void music(){
        System.out.println("this phone has best sound quality clear bass and treble");
    }

    public static void main(String[] args) {
        Mobile obj= new Mobile();
          obj.name();
          obj.work();
          obj.camera();
          obj.music();
    }
}
