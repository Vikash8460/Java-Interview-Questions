package Searching;

import java.util.Scanner;

public class JumpSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter key to be searched:");
        int key = sc.nextInt();

        System.out.println("Element found at index: " + jumpSearch(arr, key));

    }

    public static int jumpSearch(int[] arr, int key) {
        int n = arr.length;
        int block_size = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (arr[Math.min(block_size, n) - 1] < key) {
            prev = block_size;
            block_size += (int) Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }

        while (arr[prev] < key) {
            prev++;
            if (prev == Math.min(block_size, n))
                return -1;
        }

        if (arr[prev] == key)
            return prev;

        return -1;
    }
}
