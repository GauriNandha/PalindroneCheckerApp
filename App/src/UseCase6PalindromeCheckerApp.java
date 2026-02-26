import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App (UC6: Queue + Stack Based) ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindromeUsingQueueAndStack(input);

        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
    public static boolean checkPalindromeUsingQueueAndStack(String input) {
        input = input.toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }
        while (!stack.isEmpty()) {

            char fromStack = stack.pop();
            char fromQueue = queue.remove();

            if (fromStack != fromQueue) {
                return false;
            }
        }

        return true;
    }
}