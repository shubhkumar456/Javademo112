package findsecondlagestarray;

import java.util.Arrays;

public class FindSecondArray2 {
    public static int seclargest(int[]a, int total ){
        Arrays.sort(a);
        return a[total -2];
    }

    public static void main(String[] args) {
        int a[]={6,8,9,217,756,98,100,900,700};
        System.out.println("second largest :"+seclargest(a,9));
    }
}
