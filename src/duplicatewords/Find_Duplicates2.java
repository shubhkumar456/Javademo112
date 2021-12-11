package duplicatewords;

import java.util.Locale;

public class Find_Duplicates2 {
    public static void main(String[] args) {
        String Book = "The summary of the core java";
        int vowels =0, consonants=0,digits=0;

        Book = Book.toLowerCase();
        for (int i=0; i<Book.length(); i++){
            char var =Book.charAt(i);

            if (var=='a' ||var=='e' ||var=='i' ||var=='o' ||var=='u'){
                vowels++;
            }
            else if (var>='a' && var<='z'){
                consonants++;
            }
            else if (var>=0 && var<=9){
                digits++;
            }
        }
        System.out.println("Vowels :"+vowels);
        System.out.println("Consonants :"+consonants);
        System.out.println("Digits :"+digits);
    }
}
