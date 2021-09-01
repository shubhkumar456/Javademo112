package inheritance;

public class Methodoverloading3 {

    public void m2(){

        System.out.println("My system was hacked b the others");
    }

    public void m2(int a){

        System.out.println("there is some integer value ");

    }
    public void m2(String a){

        System.out.println("the wrestler name in string");
    }

    public void m2(double a){

        System.out.println("there is present the double value ");
    }

    public static void main(String[] args) {
        Methodoverloading3 obj = new Methodoverloading3();
        obj.m2();
        obj.m2(44);
        obj.m2("hulk hogan");
        obj.m2(55.0);
    }
}
