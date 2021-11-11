package scanner2;

import java.util.Scanner;

public class Cal_with_Scanner {

    public int add(int a,int b){
        int result = a+b;
        return result;
    }

    public int subs(int a,int b){
        int result = a-b;
        return result;
    }

    public int div(int a,int b){
        int result = a/b;
        return result;
    }

    public int mult(int a,int b){
        int result = a*b;
        return result;
    }

    public static void main(String[] args) {
        Cal_with_Scanner obj = new Cal_with_Scanner();
        Scanner myObj = new Scanner(System.in);

        System.out.println("please select ur choices 1 for addition,2 for substraction,3 for division and 4 for multiply");
        int choice = myObj.nextInt();

        System.out.println("please enter value of a");
        int a = myObj.nextInt();
        System.out.println("please enter value of b");
        int b = myObj.nextInt();

         int result;

         if(choice==1){
             System.out.println("select addition");
             result= obj.add(a,b);
         }
         else if(choice==2){
             System.out.println("you have select subs");
             result= obj.subs(a,b);
         }
         else if(choice==3) {
             System.out.println("you select divide");
             result= obj.div(a,b);
         }
         else{
             System.out.println("you select multiply");
             result= obj.mult(a,b);
         }
         System.out.println("the result of the calculator is :-"+result);
         }

    }

