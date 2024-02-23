import java.util.Scanner;

public class PalindromeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to be checked");
        String str = sc.next();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (rev.toLowerCase().equals(str.toLowerCase())) {
            System.out.println("String: " + str + " is a palindrome");
        } else System.out.println("String: " + str + " is not a palindrome");
    }
}
