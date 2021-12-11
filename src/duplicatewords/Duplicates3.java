package duplicatewords;

public class Duplicates3 {
    public static void main(String[] args) {
        String movie = "Main Hi Raja Main Hi Mantri";
        int vowel =0,consonant=0,digit=0;

        for (int i=0; i<movie.length(); i++){
            char val = movie.charAt(i);

            if (val=='a' || val=='e' || val=='i' || val=='o' || val=='u'){
                vowel++;
            }
            else if (val>='a' && val<='z'){
                consonant++;
            }
            else if (val>='0' && val<='9'){
                digit++;
            }
        }
        System.out.println("Vowels :-"+vowel);
        System.out.println("Consonant :-"+consonant);
        System.out.println("Digit :-"+digit);
    }
}
