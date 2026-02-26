import java.util.Scanner;
class PalindromeChecker {
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        return isPalindromeUsingArray(normalized);
    }
    private boolean isPalindromeUsingArray(String str) {

        char[] charArray = str.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App (UC11: OOP Based) ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}