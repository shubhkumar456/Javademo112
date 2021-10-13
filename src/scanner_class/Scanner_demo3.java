package scanner_class;

import java.util.Scanner;

public class Scanner_demo3 {


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Today is the 8th day of my class");
        String classname = myObj.nextLine();
        System.out.println("the name of the class is :"+classname);

        System.out.println("the song which i listen repeatedly");
        String songname = myObj.nextLine();
        System.out.println("the name of the song is :"+songname);

        System.out.println("Iam young");
        int age = myObj.nextInt();
        System.out.println("My age is :"+age);

        System.out.println("the quantity of the mobile phone in my house is");
        int numbers = myObj.nextInt();
        System.out.println("that is  :"+numbers);

        System.out.println(" I work for the Java company ");
        double salary = myObj.nextDouble();
        System.out.println("the salary is :"+salary);

    }



}
