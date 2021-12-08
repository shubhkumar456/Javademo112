package find_duplicates;

public class Frequency4 {
    public static void main(String[] args) {
        int c[] = {1,2,3,4,5,6,4,3,5,4,5,2};
        int out = Integer.MIN_VALUE;
        for (int i=0; i<c.length; i++){
            if (c[i]>out)
                out = c[i];
        }
        int d[] = new int[out+1];
        for (int i=0; i< c.length; i++){
            d[c[i]]++;
        }
        for (int i=0; i<=out; i++){
            if (d[i]>1)
                System.out.println(i+"     "+d[i]);
        }
    }
}
