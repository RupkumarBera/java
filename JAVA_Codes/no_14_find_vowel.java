import java.util.Scanner;

public class no_14_find_vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); 
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    System.out.println(ch + " is a vowel.");
                } else {
                    System.out.println(ch + " is a consonant.");
                }
            } else {
                System.out.println(ch + " is not a letter.");
            }
        }
        
        scanner.close();
    }
    
    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
