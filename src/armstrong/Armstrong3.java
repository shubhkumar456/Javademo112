package armstrong;

public class Armstrong3 {
    public static void main(String[] args) {
        int r, sum=0;
        int n=142;
        int temp=n;
        while (n>0){
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if (temp==sum)
            System.out.println("This is armstrong number");
        else
            System.out.println("This is not armstrong number");
    }
}
