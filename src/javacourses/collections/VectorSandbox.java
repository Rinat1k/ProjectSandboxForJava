package javacourses.collections;

import java.util.Comparator;
import java.util.Vector;

public class VectorSandbox {
    public static void main(String[] args) {
        Vector<Footballer> vector = new Vector<>();
        vector.add(new Footballer(10));
        vector.add(new Footballer(20));
        vector.sort((Comparator.comparingInt(t -> t.skill)));
        System.out.println(vector);

    }
}
