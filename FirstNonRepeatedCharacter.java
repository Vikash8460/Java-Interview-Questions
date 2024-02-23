import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next().toLowerCase();
        char result = findFirstNonRepeatedCharacter(str);
        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found in the string.");
        }

    }

    public static char findFirstNonRepeatedCharacter(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charCountMap.get(ch) == 1) {
                return ch;
            }
        }
        return '\0';
    }

}
