package leetcode.task9;


/**
 * ref to task: <a href="https://leetcode.com/problems/palindrome-number/">...</a>
 * level: easy
 * Task 9
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * with and without String.
 *
 */
public class PalindromeNumber {

    public boolean isPalindromeWithString(int x) {
        StringBuilder sb = new StringBuilder(Integer.toString(x));
        return sb.reverse().toString().equals(sb.reverse().toString());
    }

    public boolean isPalindromeWithoutString(int x) {
        if (x < 0) return false;
        return true;
    }

}

class PalindromeNumberTest {
    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println("debug");
    }
}