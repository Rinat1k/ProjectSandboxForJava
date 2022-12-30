package leetcode.task392;

/**
 * ref to task: <a href="https://leetcode.com/problems/is-subsequence/">...</a>
 * <p>
 * level: easy
 */
public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

        if (s.isEmpty()) return true;
        if (t.isEmpty()) return false;

        int currentIndex = -1;

        for (int i = 0; i < s.length(); i++) {
            currentIndex = t.indexOf(String.valueOf(s.charAt(i)), currentIndex + 1);
            if (currentIndex == -1) return false;
        }
        return true;
    }

    public boolean isSubsequenceILike(String s, String t) {
        int j = 0;
        for(int i = 0; i < t.length(); ++i) {
            if(j < s.length() && t.charAt(i) == s.charAt(j)) {
                ++j;
            }
        }
        return j == s.length();
    }

}