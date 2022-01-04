package findsecondlagestarray;

import java.util.Arrays;

public class Second1 {
    public static void main(String[] args) {
        int []var={12,23,34,4556};
        int size= var.length;
        Arrays.sort(var);
        int sum=var[size-2];
        System.out.println("Array sorted::"+Arrays.toString(var));
        System.out.println("The second largest array is::"+sum);
    }
}
