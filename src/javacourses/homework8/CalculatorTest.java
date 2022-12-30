package javacourses.homework8;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int[] testData = {5, 2, 10};

        System.out.println(Calculator.getMultiplyThreeValues(testData[0], testData[1], testData[2]));

        Calculator.showDivideSecondOnFirstValue(testData[2], testData[1]);

        System.out.println(calculator.getCircleArea(testData[0]));

        System.out.println(calculator.getCircleLength(testData[0]));


        try {
            System.out.println(calculator.getCircleArea(-10));

        } catch (ArithmeticException arithmeticException) {
            arithmeticException.printStackTrace();
        }

        try {
            System.out.println(calculator.getCircleLength(-10));
        } catch (ArithmeticException arithmeticException) {
            arithmeticException.printStackTrace();
        }
    }
}
