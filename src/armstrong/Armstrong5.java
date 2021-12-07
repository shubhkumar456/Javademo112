package armstrong;

import java.util.Scanner;

public class Armstrong5 {

    static boolean armstrong(int a){
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
        System.out.println("Enter Limits ");
        Scanner C = new Scanner(System.in);
        int N = C.nextInt();
        System.out.println("Armstrong number is :-"+N);

        for (int i=0; i<=N; i++)
            if (armstrong(i))
                System.out.println(i);
    }
}
