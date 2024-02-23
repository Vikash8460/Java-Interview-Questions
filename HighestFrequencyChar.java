import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestFrequencyChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();

        char highestFreqChar = findHighestFrequencyChar(str);
        System.out.println("Highest frequent character: " + highestFreqChar);
    }

    public static char findHighestFrequencyChar(String str) {
        HashMap<Character, Integer> charFreqMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
        }

        char highestFreqChar = ' ';
        int highestFreq = 0;
        for (Map.Entry<Character, Integer> entry : charFreqMap.entrySet()) {
            char currentChar = entry.getKey();
            int currentFreq = entry.getValue();

            if (currentFreq > highestFreq) {
                highestFreq = currentFreq;
                highestFreqChar = currentChar;
            }
        }

        return highestFreqChar;
    }

}