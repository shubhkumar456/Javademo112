package duplicatecharacter;

public class Duplicate2 {
    public static void main(String[] args) {
        String name = "Bang Bang";
        char[] str = name.toCharArray();

        System.out.println("the String are " + name);
        System.out.print("Duplicate characters are : ");

        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i] == str[j]) {
                    System.out.print(str[j] + " ");
                }
            }
        }
    }
}