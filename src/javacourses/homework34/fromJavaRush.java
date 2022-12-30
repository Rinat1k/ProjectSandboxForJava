package javacourses.homework34;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class fromJavaRush {
    public static void main(String[] args) {

        String[] array1 = {"мама", "мыла", "раму"};
        String[] array2 = {"я", "очень", "люблю", "java"};
        String[] array3 = {"мир", "труд", "май"};

        List<String[]> arrays = new ArrayList<>();
        arrays.add(array1);
        arrays.add(array2);
        arrays.add(array3);

        arrays.sort(new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1.length - o2.length;
            }
        });

        System.out.println(arrays);

        arrays.sort((String[] s1, String[] s2) -> s2.length - s1.length);
        System.out.println(arrays);
    }
}
