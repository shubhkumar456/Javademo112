package armstrong;

import java.util.Scanner;

public class Armstrong3 {

    static boolean armsno(int a){
        int temp, digit=0,last=0,sum=0;
        temp=a;
        while (temp>0){
            temp=temp/10;
            digit++;
        }

        temp=a;
        while (temp>0){
            last=temp%10;
            sum+=(Math.pow(last,digit));
            temp=temp/10;
        }

        if (a==sum)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println("enter value");
        Scanner B = new Scanner(System.in);
        int bv = B.nextInt();
        System.out.println("Armstrong number is "+bv);

        for (int i=0; i<=bv; i++)
            if (armsno(i))
                System.out.println(i);

    }
}
