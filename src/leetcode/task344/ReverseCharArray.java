package leetcode.task344;

public class ReverseCharArray {
    public static char[] reverseString(char[] s) {
        char temp;
        for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        return s;
    }
}
