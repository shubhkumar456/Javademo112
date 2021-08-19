package javamethods2;

public class Inputwithparams {

    public void message(String name ){

        System.out.println("welcome to the world of" +name);
        System.out.println(name);
    }
    public void twoparams(String name, int age){
        System.out.println("My name is------"+name);
        System.out.println("my age is---"+age);
    }
    public void multipleparams(String name,int age,double salary,String language,int days,double time){
        System.out.println("My name is --"+ name);
        System.out.println("My age is --"+age);
        System.out.println("My monthly salary is --"+salary);
        System.out.println("The name of the language which i learn is --"+language);
        System.out.println("The  number of days attend the class "+days);
        System.out.println("There is the time which should i learn this language"+time);


    }
    public void threeparams(String name,int age,double salary){
        System.out.println("my name is-"+name + "my age is- "+age +"my salary is- "+salary);

    }

    public static void main(String[] args) {
        Inputwithparams obj = new Inputwithparams();
           obj.message("JAVA" );
           obj.twoparams("Shubendra Kumar",24);
           obj.multipleparams("Shubendra kumar",24,54000.5,"JAVA",10,9.30);
           obj.threeparams("Shubendra kumar",24,45000.4);
    }
}
