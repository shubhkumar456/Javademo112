package findsecondlagestarray;

import java.util.Arrays;

public class Find_SecondArray {
    public static int secondlargest(int[]a, int total) {
        Arrays.sort(a);
        return a[total - 2];
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
//        int b[] = {11,33,55,66,77,88,99};
        System.out.println("second largest :"+ secondlargest(a,7));
//        System.out.println("second largest :"+secondlargest(b,7));
    }
}
