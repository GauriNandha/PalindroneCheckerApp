import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App (UC7: Deque-Based Optimized) ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindromeUsingDeque(input);

        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }

    // Method implementing Deque logic
    public static boolean checkPalindromeUsingDeque(String input) {

        // Convert to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        // Compare front and rear until deque size <= 1
        while (deque.size() > 1) {

            char front = deque.removeFirst();  // Remove from front
            char rear = deque.removeLast();    // Remove from rear

            if (front != rear) {
                return false;
            }
        }

        return true;
    }
}