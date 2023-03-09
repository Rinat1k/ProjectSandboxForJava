package javacourses.lambdaExpressionsAndStreams;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntPredicate;

/**
 * Для любого набора случайно-сгенерированных чисел нужно определить количество парных.
 * Для решения задачи использовать средства программного интерфейса Stream API.
 */
public class getNumberOfEvenIntegers {
    public static void main(String[] args) {
        int [] integers = new int [3];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = new Random().nextInt();
        }

        System.out.println(Arrays.toString(integers));
        System.out.println(Arrays.stream(integers).filter(new IntPredicate() {
            @Override
            public boolean test(int i) {
                return i % 2 == 0;
            }
        }).count());
    }
}
