package find_duplicates;

public class Frequency3 {

    public static void main(String[] args) {
        int x[] = {2,2,2,3,3,3,4,4,5,5,6,6,6,9,9};
        int var = Integer.MIN_VALUE;
        for (int i=0; i< x.length; i++){
            if (x[i]>var)
             var= x[i];
        }
        int y[] = new int[var+1];
        for (int i=0; i< x.length; i++){
            y[x[i]]++;
        }
        for (int i=0; i<=var; i++){
            if (y[i]>1)
                System.out.println(i+"  "+y[i]);

        }
    }
}
