import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App (UC10: Case-Insensitive & Space-Ignored) ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(input);

        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }

    public static boolean checkPalindrome(String input) {
        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}