public class Class {













//    static String removedup(char str[],int n){
//        int index=0;
//        for (int i=0; i<n; i++){
//            int j;
//            for (j=0;j<i; j++){
//                if (str[i]==str[j]){
//                    break;
//                }
//            }
//            if(j==i){
//                str[index++]=str[i];
//            }
//        }
//        return String.valueOf(Arrays.copyOf(str,index));
//    }
//
//    public static void main(String[] args) {
//        char str[]="aaabbbcccdeffga".toCharArray();
//        int n= str.length;
//        System.out.println(removedup(str,n));
//    }

























//    public static void main(String[] args) {
//        int r,sum=0;
//        int n=221;
//        int temp=n;
//        while (n>0){
//            r=n%10;
//            sum=sum*10+r;
//            n=n/10;
//        }
//        if (temp==sum)
//            System.out.println("it is palin");
//        else
//            System.out.println("it is not palin");
//    }





    String s = "aaabbbcccdeffga";
    //output will be abcdefga














//public static int getmax(int[]a, int total){
//    int temp;
//    for (int i=0; i<total; i++){
//        for (int j=i+1; j<total; j++){
//            if (a[i]>a[j]){
//                temp=a[i];
//                a[i]=a[j];
//                a[j]=temp;
//            }
//        }
//    }
//    return a[total-1];
//
//}
//
//    public static void main(String[] args) {
//        int a[]={1,2,5,6,3,};
//        int b[]={44,66,99,88,55,78};
//        System.out.println("MAximum");
//    }
//








}
