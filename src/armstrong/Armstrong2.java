package armstrong;

import java.util.Scanner;

public class Armstrong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int m= sc.nextInt();
        int var=m;
        int a,sum=0;
        while (m>0){
            a=m%10;
            m=m/10;
            sum=sum+a*a*a;
        }
        if (var==sum)
            System.out.println("It is armstrong");
        else
            System.out.println("it is not armstrong");

    }
}
