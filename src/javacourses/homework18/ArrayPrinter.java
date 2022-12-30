package javacourses.homework18;

public class ArrayPrinter {
    public static void print(int[] array) {
        System.out.print("[");
        for (int j : array) {
            System.out.print(j);
        }
        System.out.print("]\n");
    }

    public static void matrixPrint(int [][] matrix) {
        System.out.print("{");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("{");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.print("}");
        }
        System.out.print("}");
    }
}
