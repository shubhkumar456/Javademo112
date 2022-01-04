package find_duplicates;

public class Find_Duplicates {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,78,4,6};
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println("The duplicates array is :"+arr[j]);
                }
            }

        }
    }
}
