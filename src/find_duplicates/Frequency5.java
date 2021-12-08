package find_duplicates;

public class Frequency5 {
    public static void main(String[] args) {
        int X[]={1,2,3,2,4,3,5,4,5,6,5,7,8};
        int val = Integer.MIN_VALUE;
        for (int i=0; i<X.length; i++){
            if (X[i]>val)
                val=X[i];
        }
        int Y[] = new int[val+1];
        for (int i=0; i< X.length; i++){
            Y[X[i]]++;
        }
        for (int i=0; i<=val; i++){
            if (Y[i]>1)
                System.out.println("Frequency | Elements");
                System.out.println("   "+i+"            "+Y[i]);
        }
    }
}
