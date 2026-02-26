import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App (UC4: Character Array Based) ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindromeUsingCharArray(input);

        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }

    // Method implementing UC4 logic
    public static boolean checkPalindromeUsingCharArray(String input) {

        // Convert string to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        // Convert string to character array
        char[] charArray = input.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {

            // Compare characters at start and end
            if (charArray[start] != charArray[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
