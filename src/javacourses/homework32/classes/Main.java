package javacourses.homework32.classes;

import javacourses.homework32.myExceptions.NotWaterException;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();

        try {
            tiger.eat("MEAt");
            tiger.drink("Water");
            try {
                tiger.drink("Bear");
            } catch (NotWaterException notWaterException) {
                System.out.println("Inner exception " + notWaterException.getMessage());
            } finally {
                System.out.println("This is inner finally block");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is outer finally block");
        }

    }
}
