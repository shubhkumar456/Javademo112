package duplicatecharacter;

public class Duplicates {
    public static void main(String[] args) {
        String car = "volkswagen polo";
        char[] s = car.toCharArray();

        System.out.println("the string is::" + car);
        System.out.print("duplicates are:: ");
        for (int i = 0; i < car.length(); i++) {
            for (int j = i + 1; j < car.length(); j++) {
                if (s[i] == s[j]) {
                    System.out.print(s[j]+",");
                    break;
                }
            }
        }
    }
}