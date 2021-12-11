package duplicatewords;

import java.util.Locale;

public class Find_Duplicates3 {
    public static void main(String[] args) {
        String phrase ="Iam No God And I'm Not One of You Either";
        int vowel=0, consonant=0,digit=0;

        phrase =phrase.toLowerCase();
        for (int i=0; i<phrase.length(); i++ ){
            char val= phrase.charAt(i);

            if (val=='a' || val=='e' || val=='i' || val=='o' || val=='u'){
                vowel++;
            }

            else if (val>='a' && val<='z'){
                consonant++;
            }
            else if (val>='0' && val<='9'){

            }
        }
        System.out.println("Vowels :"+vowel);
        System.out.println("Consonants :"+consonant);
        System.out.println("Digits :"+digit);
    }
}
