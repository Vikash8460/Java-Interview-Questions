import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n;
        do {
            n = sc.nextInt();
            System.out.println("Enter valid input");
        } while (n < 0);

        if (n == 0) {
            System.out.println("Empty array");
            System.exit(0);
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Largest number in the given array is: " + max);
    }
}
