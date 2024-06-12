public class Interview_Que {
    public static void main(String[] args) {

        int n=50;
         n=2*n-1;
        int val=1;
        for (int i = 1; i <= n; i+=2) {
            for (int j = 0; j <i; j++) {
                System.out.print(val);
                val +=1;

            }
            System.out.println();
        }
    }
}