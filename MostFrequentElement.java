import java.util.*;

public class MostFrequentElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int mostFrequentElement = findMostFrequentElement(arr);
        System.out.println("The most frequent element is: " + mostFrequentElement);
    }

    public static int findMostFrequentElement(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mostFrequentElement = 0;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency) {
                mostFrequentElement = num;
                maxFrequency = frequency;
            }
        }
        return mostFrequentElement;
    }
}