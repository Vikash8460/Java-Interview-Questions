import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = ((n + 1) * (n + 2)) / 2;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += arr[i];
        }
        System.out.println("Missing number is:" + (sum - sum2));
    }
}
