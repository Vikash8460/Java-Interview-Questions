import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String args[]) {
        int vowels = 0, consonants = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word/sentence");
        String str = sc.nextLine().toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowels++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                consonants++;
            }
        }
        System.out.println("total vowels: " + vowels);
        System.out.println("total consonants: " + consonants);
    }
}
