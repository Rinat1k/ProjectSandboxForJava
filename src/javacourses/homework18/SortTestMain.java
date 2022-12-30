package javacourses.homework18;

public class SortTestMain {
    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 1, 6, 7, 8, 2, 3};

        int[][] matrix = {{1,2,3}, {1,2,3,4,5,6}, {1,2,3,0}, {1,2,3,7,6}};

        ArrayPrinter.print(BubbleSort.sort(array));

        ArrayPrinter.matrixPrint(matrix);
    }
}
