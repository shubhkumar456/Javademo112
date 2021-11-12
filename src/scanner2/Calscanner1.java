package scanner2;

import java.util.Scanner;

public class Calscanner1 {

    public int add(int a, int b){
        int result = a+b;
        return result;
    }

    public int sub(int a, int b){
        int result = a-b;
        return result;
    }

    public int mul(int a, int b){
        int result = a*b;
        return result;
    }

    public int div(int a, int b){
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        Calscanner1 obj = new Calscanner1();
        Scanner myObj = new Scanner(System.in);

        System.out.println("some choices 1 for add, 2 for sub, 3 for multiply and 4 for division");
        int choice = myObj.nextInt();

        System.out.println("enter value of a");
        int a = myObj.nextInt();
        System.out.println("enter value of b");
        int b = myObj.nextInt();

        int result;
        if(choice==1){
            System.out.println("select addition");
            result= obj.add(a,b);
        }
        else if(choice==2){
            System.out.println("select substraction");
            result= obj.sub(a,b);
        }
        else if(choice==3){
            System.out.println("select multiply");
            result= obj.mul(a,b);
        }
        else{
            System.out.println("select division");
            result= obj.div(a,b);
        }
        System.out.println("The sum of the numbers in calculator :-"+result);

    }

}
