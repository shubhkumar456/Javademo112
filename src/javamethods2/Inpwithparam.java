package javamethods2;

//import org.omg.PortableInterceptor.ServerRequestInfo;

public class Inpwithparam {

    public void student1(String name,int age,double height,String profession){
        System.out.println("My name is--"+name +" My age is --"+age+  " My height is - "+height+ "  I'm doing job in --"+profession);

    }

    public void student2(String name,int age, double height,String profession){
        System.out.println("My name is--"+name +" My age is --"+age+  " My height is - "+height+ "  I'm doing job in --"+profession);

    }

    public void student3(String name,int age, double height,String profession){
        System.out.println("My name is--"+name +" My age is --"+age+  " My height is - "+height+ "  I'm doing job in --"+profession);

    }

    public void student4(String name,int age, double height,String profession){
        System.out.println("My name is--"+name +" My age is --"+age+  " My height is - "+height+ "  I'm doing job in --"+profession);

    }

    public void student5(String name, int ram, int rom, double price, String manufacturer,String company){
        System.out.println("Tne name of the mobile is:-- "+name);
        System.out.println("The ram of the mobile is:--"+ram);
        System.out.println("The rom of the mobile is:--"+rom);
        System.out.println("the price of the mobile is:--"+price);
        System.out.println("The mobile manufactured in:--"+manufacturer);
        System.out.println("The company of the mobile is:--"+company);

    }



    public static void main(String[] args) {
        Inpwithparam obj = new Inpwithparam();
        obj.student1("Shubendra kumar",24,5.8,"Software Engineer");
        obj.student2("Arun singh",25,5.10,"SI in Delhi Police");
        obj.student3("Subodh Kumar",26,5.7,"Government Teacher");
        obj.student4("Gulshan Kumar",26,6.0,"Software Engineer");
        obj.student5("Vivo Z1Pro",6,64,17999.0,"Made in India","VIVO");
    }
}