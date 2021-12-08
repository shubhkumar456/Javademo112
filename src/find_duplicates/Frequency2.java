package find_duplicates;

public class Frequency2 {
    public static void main(String[] args) {
        int M[] = {1,2,1,2,3,4,5,4,6,7,5,7,8,8,9,3,};
        int max = Integer.MIN_VALUE;
        for (int i=0; i< M.length; i++){
            if (M[i]>max)
                max=M[i];
        }

        int N[] = new int[max+1];
        for (int i=0; i< M.length; i++){
             N[M[i]]++;
        }
        for (int i=0; i<=max; i++){
            if (N[i]>1)
                System.out.println("Elements  Frequency");
            System.out.println(i+"                "+N[i]);
        }
    }
}
