package armstrong;

import java.util.Scanner;

public class Armstrong2{

    static boolean armstrong(int m){
        int temp, digit=0,last=0,sum=0;

        temp=m;
        while (temp>0){
            temp=temp/10;
            digit++;
        }
        temp=m;
        while (temp>0){
            last=temp%10;
            sum +=(Math.pow(last,digit));
            temp=temp/10;
        }
        if (m==sum)
            return true;
        else return false;

    }

    public static void main(String[] args) {

        System.out.println("enter limit ");
        Scanner n = new Scanner(System.in);
        int v = n.nextInt();
        System.out.println("armsstrong numbers are "+v+" are :");

        for (int a=0; a<=v; a++)
            if (armstrong(a))
                System.out.println(a+"-");
    }
}
