package leetcode.task13;

public class RomanToIntTest {

    private final static String[] romanData = {"III", "LVIII", "MCMXCIV"};

    public static void main(String[] args) {
        for (String str : romanData) {
            System.out.println(new RomanToInt().romanToInt(str));
        }
    }

}
