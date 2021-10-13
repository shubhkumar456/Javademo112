package scanner_class;

import java.util.Scanner;

public class Scanner_demo2 {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("I have watch the movie");
        String name = myObj.nextLine();
        System.out.println("Movie name is :"+name);

        System.out.println("today i listen the song ");
        String songname = myObj.nextLine();
        System.out.println(" the song name is :"+songname);
    }
}
