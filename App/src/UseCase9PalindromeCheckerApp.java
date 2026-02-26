import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App (UC9: Recursive Based) ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine().toLowerCase();

        boolean isPalindrome = checkPalindromeRecursive(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
    public static boolean checkPalindromeRecursive(String str, int start, int end) {

        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return checkPalindromeRecursive(str, start + 1, end - 1);
    }
}