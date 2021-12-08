package duplicatecharacter;

public class Duplicate2 {
    public static void main(String[] args) {
        String S = "Iam Complete My all Interview Java Program";
        char[] val = S.toCharArray();
        System.out.println("The string are :-"+S);
        System.out.print("the duplicate characters are: ");

        for (int i=0; i<S.length(); i++){
            for (int j=i+1; j<S.length(); j++){
                if (val[i]==val[j]){
                    System.out.print(val[j]+"");
                    break;
                }
            }
        }
    }
}
