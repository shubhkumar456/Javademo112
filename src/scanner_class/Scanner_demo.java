package scanner_class;

import java.util.Scanner;

public class Scanner_demo {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter ur username");
        String username = myObj.nextLine();
        System.out.println("My username is :"+username);



        System.out.println("I have take that class ");
        String classname = myObj.nextLine();
        System.out.println("The name of the class is :"+classname);

        System.out.println("I have create my id ");
        String id = myObj.nextLine();
        System.out.println("The user id is :"+id);
    }
}
