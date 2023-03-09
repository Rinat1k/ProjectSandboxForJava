package javacourses.nestedClasses;

public class Main {
    public static void main(String[] args) {
        MathOperation<Integer> intSumm = new MathOperation<Integer>() {
            @Override
            public Integer doOperation(Integer val1, Integer val2) {
                return val1 + val2;
            }
        };
        System.out.println(intSumm.doOperation(1, 7));

        MathOperation<Double> doubleDivided = (val1, val2) -> val1 - val2;
        System.out.println(doubleDivided.doOperation(6.4, 2.0));

    }
}
