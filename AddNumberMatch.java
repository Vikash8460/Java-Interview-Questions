import java.util.HashMap;

public class AddNumberMatch {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int[] x = {1, 6, 8, 9, 5};

        int resultIndex = findMatchingIndex(a, b, x);
        if (resultIndex != -1) {
            System.out.println("Matching index: " + resultIndex);
            System.out.println("Number from the array: " + x[resultIndex]);
        } else {
            System.out.println("No match found.");
        }
    }

    public static int findMatchingIndex(int a, int b, int[] x) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < x.length; i++) {
            int target = b - a;
            if (map.containsKey(target)) {
                return map.get(target);
            }
            map.put(x[i], i);
        }

        return -1;
    }

}
