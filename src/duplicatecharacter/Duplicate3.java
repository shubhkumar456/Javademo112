package duplicatecharacter;

public class Duplicate3 {
    public static void main(String[] args) {
        String mean="Hello World Welcome ";
        char[] s= mean.toCharArray();

        System.out.println("String are :-"+mean);
        System.out.print("Duplicates are : ");
        for (int i=0;i<s.length;i++){
            for (int j=i+1;j< s.length;j++){
                if (s[i]==s[j]){
                    System.out.print(s[j]+" ");
                break;
            }
        }
    }
}
}