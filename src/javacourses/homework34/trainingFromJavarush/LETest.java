package javacourses.homework34.trainingFromJavarush;

public class LETest {
    public static void main(String[] args) {
        System.out.println(isDividedOn13(13));
        System.out.println(isDividedOn13(15));
        System.out.println(getLongerString("111", "1111"));
        System.out.println(getLongerString("11111", "1111"));
        System.out.println(getDiscriminant(1.5, 1.6, 1.7));
        System.out.println(getPower(2, 2, 4));
    }

    public static boolean isDividedOn13(int value) {
        return ((DividedPredicate) value1 -> value1 % 13 == 0).test(value);
    }

    public static String getLongerString(String s1, String s2) {
        return ((BinaryString) (var ss1, var ss2) -> {
            if (ss1.length() > ss2.length()) return ss1;
            else return ss2;
        }).test(s1, s2);
    }

    public static double getDiscriminant(double value1, double value2, double value3) {
        return ((TernaryMathOperation<Double>) (Double v1, Double v2, Double v3) -> {
            return v2 * v2 - 4 * v1 * v3;
        }).test(value1, value2, value3);
    }

    public static int getPower(int value1, int value2, int value3) {        TernaryMathOperation<Integer> ternaryMathOperation = (Integer v1, Integer v2, Integer v3) ->
                v1 * (int) Math.pow(v2, v3);

        return ternaryMathOperation.test(value1, value2, value3);

    }

}
