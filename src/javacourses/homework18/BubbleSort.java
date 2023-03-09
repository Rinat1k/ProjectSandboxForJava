package javacourses.homework18;

public class BubbleSort {

    public static int[] sort(int[] array) {
        int tempValue;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j-1]) {
                    tempValue = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tempValue;
                }
            }
        }
        return array;
    }


}
