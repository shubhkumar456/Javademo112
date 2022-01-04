package duplicatecharacter;

public class Duplicate1 {
    public static void main(String[] args) {
        String name = "Java Is Programming Language";
        char[] str = name.toCharArray();

        System.out.println("The original string::"+name);
        System.out.print("Duplicates in string:: ");

        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j < name.length(); j++) {
                if (str[i] == str[j]) {
                    System.out.print(str[j] +",");
                    break;
                }
            }
        }
    }
}