package leetcode.task13;


import java.util.HashMap;

/**
 * ref to task: <a href="https://leetcode.com/problems/roman-to-integer/">...</a>
 * <p>
 * level: easy
 */
public class RomanToInt {

    public int romanToInt(String s) {
        HashMap<Character, Integer> romanToInts = new HashMap<Character, Integer>() {
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {

            if (i + 1 != s.length()) {
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                    sum += 4;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                    sum += 9;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                    sum += 40;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                    sum += 90;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                    sum += 400;
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                    sum += 900;
                    i++;
                    continue;
                }
            }
            sum += romanToInts.get(s.charAt(i));
        }

        return sum;
    }

}
