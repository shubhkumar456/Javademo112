package scanner2;

import java.util.Scanner;

public class Scanner_class2 {

    public int addition(int a, int b){
        int result = a+b;
        return result;
    }

    public int subtraction(int a,int b){
        int result = a-b;
        return result;
    }

    public int multiplication(int a,int b){
        int result = a*b;
        return result;
    }

    public int division(int a,int b){
        int result = a/b;
        return result;
    }


    public static void main(String[] args) {
        Scanner_class2 obj = new Scanner_class2();
        Scanner myObj =  new Scanner(System.in);

        System.out.println("please enter choice value of 1 for addition, 2 for substraction, 3 for multiplication and 4 for division");
        int choice= myObj.nextInt();

        System.out.println("print value of a ");
        int a = myObj.nextInt();
        System.out.println("print value of b ");
        int b = myObj.nextInt();

        int result;
       if(choice==1){
           System.out.println("you have select addition");
           result = obj.addition(a,b);
       }
       else if(choice==2){
           System.out.println("you have select substraction");
           result = obj.subtraction(a,b);
       }
       else if (choice==3){
           System.out.println("you have select multiplication");
           result = obj.multiplication(a,b);
       }
       else{
           System.out.println("you have select divide1");
           result = obj.division(a,b);
        }

       System.out.println("Calculator result is :-"+result);
    }
}
