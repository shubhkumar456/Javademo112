package duplicatecharacter;

public class Duplicate {
    public static void main(String[] args) {
        String str = "My name is shubendra kumar";
        char[] var = str.toCharArray();

        System.out.println("The string is :" + str);
        System.out.print("duplicate characters are :  ");

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (var[i] == var[j]) {
                    System.out.print(var[j]+",");
                     break;
                }
            }
        }
    }
}