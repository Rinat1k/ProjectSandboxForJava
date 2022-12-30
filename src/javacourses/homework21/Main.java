package javacourses.homework21;

import java.util.ArrayList;

public class Main {

    /**
     *
     * @param stringArray n-e количество строковых значений
     * @return список состоящий из уникальных значений
     */
    public static ArrayList<String> abc(String... stringArray) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str: stringArray) {
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }


    public static void main(String[] args) {
    }
}

