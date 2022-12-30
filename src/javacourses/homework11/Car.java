package javacourses.homework11;

import java.util.Random;

public class Car {

    String color;
    String motor;
    int numberOfDoors;

    public Car() {}
    public Car(String color, String motor, int numberOfDoors) {
        this.color = color;
        this.motor = motor;
        this.numberOfDoors = numberOfDoors;
    }

    public void changeNumberOfDoorsOnRandomValue(Car car) {
        int randomValue = new Random().nextInt(0, 10);
        car.numberOfDoors = randomValue;
        System.out.println("Количество дверей изменено на значение: " + randomValue);
    }

    public void swapColors(Car car1, Car car2) {
        String tempColor;
        tempColor = car1.color;
        car1.color = car2.color;
        car2.color = tempColor;
        System.out.println("Цвета машин изменены");
    }

}

class Program {
    public static void main(String[] args) {

        Car car1 = new Car("Black", "V8", 2);
        Car car2 = new Car("White", "V12", 4);

        new Car().changeNumberOfDoorsOnRandomValue(car1);
        System.out.println(car1.numberOfDoors);

        new Car().swapColors(car1, car2);
        System.out.println(car1.color);
        System.out.println(car2.color);


    }
}
