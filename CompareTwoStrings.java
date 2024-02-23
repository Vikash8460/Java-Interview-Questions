import java.util.Scanner;

public class CompareTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string");
        String str1 = sc.next();
        System.out.println("Enter 2nd String:");
        String str2 = sc.next();

        if (str1.equals(str2)) {
            System.out.println("Strings matched!");
        } else if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings matched when case is ignored");
        } else System.out.println("Strings don't match");
    }
}
