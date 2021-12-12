package reverseString;

public class ReverseString2 {

    public static void main(String[] args) {
        String name ="Shubendra kumar";
        String reverse ="";

        for (int i=name.length()-1; i>=0; i--){
            reverse = reverse+name.charAt(i);
        }
        System.out.println("Normal String "+name);
        System.out.println("Reverse String "+reverse);
    }
}
