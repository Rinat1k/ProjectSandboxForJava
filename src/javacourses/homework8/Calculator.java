package javacourses.homework8;

import java.text.DecimalFormat;

public class Calculator {

    public static final double PI = 3.14;

    public static int getMultiplyThreeValues(int value1, int value2, int value3) {
        return value1 * value2 * value3;
    }

    public static void showDivideSecondOnFirstValue(double value1, double value2) {
        if (value2 == 0) throw new ArithmeticException("На ноль делить нельзя");
        System.out.println("Целое частное: " + Math.round(value1 / value2));
        System.out.println("Остаток: " + Math.round(value1 % value2));
    }

    public double getCircleArea(double radius) {
        if (radius <= 0) throw new ArithmeticException("Радиус не может быть <= 0");
        return PI * radius * radius;
    }

    public double getCircleLength(double radius) {
        if (radius <= 0) throw new ArithmeticException("Радиус не может быть <= 0");
        return Double.parseDouble(new DecimalFormat("#.#").format(2 * PI * radius).toString());
    }

}
