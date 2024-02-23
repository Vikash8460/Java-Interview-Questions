import java.util.HashMap;

public class FirstNonRepeatedNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 3, 5, 4, 4};
        int firstNonRepeated = findFirstNonRepeated(arr);
        System.out.println("First non-repeated element: " + firstNonRepeated);
    }

    public static int findFirstNonRepeated(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        throw new IllegalArgumentException("No non-repeated element found.");
    }
}
