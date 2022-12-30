package leetcode.task205;

import java.util.ArrayList;

/**
 * ref to task: <a href="https://leetcode.com/problems/isomorphic-strings/">...</a>
 * <p>
 * level: easy
 */
public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        else return getIndexes(s).equals(getIndexes(t));
    }


    //todo оптимизировать task724
    public static ArrayList<Integer> getIndexes(String s) {
        ArrayList<Integer> indexes = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (temp.toString().contains(String.valueOf(s.charAt(i)))) continue;
            indexes.add(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) indexes.set(indexes.size() - 1, j + indexes.get(indexes.size() - 1));
            }
            temp.append(s.charAt(i));
        }
        return indexes;
    }

}
