package reverseString;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Hello World";
        String reverse="";

        for (int i=name.length()-1; i>=0; i--){
            reverse =reverse+name.charAt(i);
        }
        System.out.println("Original string "+name);

        System.out.println("Reverse name "+reverse);
    }
}
