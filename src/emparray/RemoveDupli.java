package emparray;

import java.util.Arrays;

public class RemoveDupli {
    public static void main(String[] args) {
        int [] array ={1,2,3,4,5,6,7,7,8,8};

        Arrays.stream(array).distinct().forEach(elemrnt -> System.out.println(elemrnt +" "));
    }
}
