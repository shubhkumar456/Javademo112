package duplicatecharacter;

public class Duplicate3 {
    public static void main(String[] args) {
        String name = "Shubendra Kumar";
        char[] var = name.toCharArray();
        System.out.println("The string are ="+name);
        System.out.print("the duplicates are : ");

        for (int i=0; i<name.length(); i++){
            for (int j=i+1; j<name.length(); j++){
                if (var[i]==var[j]){
                    System.out.print(var[i]);
                    break;
                }
            }
        }
    }
}
