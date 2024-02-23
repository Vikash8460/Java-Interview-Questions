import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnionIntersection {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {5, 6, 7};

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : A) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int num : B) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> union = new ArrayList<>();
        List<Integer> intersection = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq == 1) {
                union.add(num); // Uncommon value
            } else if (freq == 2) {
                intersection.add(num);
            }
        }

        System.out.println("Union of A and B: " + union);
        System.out.println("Intersection of A and B: " + intersection);
    }

}
