import java.util.Scanner;
import java.util.HashMap;

public class PalindromeHashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();

        if (checkPalindrome(str)) {
            System.out.println("String is palindrome!");
        } else System.out.println("not a palindrome");
    }

    private static boolean checkPalindrome(String str) {

        HashMap<Character, Integer> charFreqMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
        }

        int oddFrequencyCount = 0;
        for (int frequency : charFreqMap.values()) {
            if (frequency % 2 != 0) {
                oddFrequencyCount++;
            }
        }

        return oddFrequencyCount <= 1;

    }
}
