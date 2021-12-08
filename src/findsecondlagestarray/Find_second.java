package findsecondlagestarray;

import java.util.Arrays;

public class Find_second {
    public static int seclargestarray(int[]a, int total){
        Arrays.sort(a);
        return a[total -2];
    }

    public static void main(String[] args) {
        int []a= {11,33,55,77,99,111,567,890,900};
        System.out.println("second largest array :"+seclargestarray(a,9));
    }
}
