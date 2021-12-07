package armstrong;

import java.util.Scanner;

public class Armstrong4 {
    static boolean arms(int a){
        int temp, digit=0,sum=0,last=0;
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
        System.out.println("value enter");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        System.out.println("Armstrong no is:- "+no);

        for (int i=0; i<=no; i++)
            if (arms(i))
                System.out.println(i);
    }
}
