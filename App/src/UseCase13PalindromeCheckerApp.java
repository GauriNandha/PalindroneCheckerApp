import java.util.*;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App (UC13: Performance Comparison) ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(normalized);
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(normalized);
        long end2 = System.nanoTime();
        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(normalized);
        long end3 = System.nanoTime();
        System.out.println("\n=== Results ===");
        System.out.println("Two-Pointer Result: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Result: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Result: " + result3 +
                " | Time: " + (end3 - start3) + " ns");

        scanner.close();
    }
    public static boolean twoPointerCheck(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean stackCheck(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }
    public static boolean dequeCheck(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}