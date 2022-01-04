package duplicatecharacter;

public class Duplicate4 {
    public static void main(String[] args) {
        String var="Developers are backend and frontend";
        char[] chars=var.toCharArray();
        System.out.println("strings are ::"+var);
        System.out.print("duplicates are:: ");

        for (int i=0;i<var.length();i++){
            for (int j=i+1;j<var.length();j++){
                if (chars[i]==chars[j]){
                    System.out.print(chars[j]);
                    break;
                }
            }
        }
    }
}
