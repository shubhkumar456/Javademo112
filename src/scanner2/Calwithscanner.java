package scanner2;

import java.util.Scanner;

public class Calwithscanner {

    public int add(int a,int b){
        int result = a+b;
        return result;
    }

    public int sub(int a,int b){
        int result = a-b;
        return result;
    }

    public int mul(int a,int b){
        int result = a*b;
        return result;
    }

    public int div(int a,int b){
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        Calwithscanner obj = new Calwithscanner();
        Scanner myObj = new Scanner(System.in);

        System.out.println("1 for addition, 2 for substraction, 3 for multiply and 4 for division");
        int choice = myObj.nextInt();

        System.out.println("enter value of a");
        int a = myObj.nextInt();
        System.out.println("enter value of b");
        int b = myObj.nextInt();

        int result;
        if(choice==1){
            System.out.println("addition selected");
            result= obj.add(a,b);
        }
        else if(choice==2){
            System.out.println("substraction selected");
            result= obj.add(a,b);
        }
        else if(choice==3){
            System.out.println("multiplication selected");
            result= obj.add(a,b);
        }
        else{
            System.out.println("division selected");
            result= obj.add(a,b);
        }
        System.out.println("Calculator result :-"+result);

    }

}
