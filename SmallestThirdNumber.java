import java.util.Arrays;
import java.util.Scanner;

public class SmallestThirdNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter numbers");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Third smallest number is: " + arr[2]);
    }
}
