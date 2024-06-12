import java.util.Arrays;

public class Practice {
//    20,25,25,88,11,109,91,11,66,66,21,21,71,5,88,13,91, 100, 100, 109

//    static void  printsecLargest()


    public static void main(String[] args) {
        int arr[] = {20, 25, 25, 88, 11, 109, 91, 11, 66, 66, 21, 21, 71, 5, 88, 13, 91, 100, 100, 109};
        int n = arr.length;
//        printsecLargest(arr, n);

        int i, first, second;
        if (n < 3) {
            System.out.println("Invalid Input");
            return;
        }

        Arrays.sort(arr);

        for (i=arr.length - 2; i >= 0; i--) {
//            if (arr[i]  = [n - 1]){
                System.out.println("Second Largest element is " + arr[i]);
                return;
            }
        }
    }
//}
