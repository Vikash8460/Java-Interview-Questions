import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();

        int r, rev = 0;
        int temp = num;

        while (num != 0) {
            r = num % 10;
            rev = (rev * 10) + r;
            num /= 10;
        }
        if (temp == rev) {
            System.out.println("Number: " + temp + " is a palindrome");
        } else {
            System.out.println("Number: " + temp + " is not a palindrome");
        }
    }
}
