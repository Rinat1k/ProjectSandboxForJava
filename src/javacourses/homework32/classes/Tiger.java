package javacourses.homework32.classes;

import javacourses.homework32.myExceptions.NotMeatException;
import javacourses.homework32.myExceptions.NotWaterException;

public class Tiger {

    public void eat(String str) {
        if (str.equalsIgnoreCase("Meat"))
            throw new NotMeatException("Tiger doesn't eat " + str +"!");
        else System.out.println("Tiger eats meat!");
    }

    public void drink(String str) throws NotWaterException {
        if (str.equalsIgnoreCase("Water"))
            throw new NotWaterException("Tiger doesn't drink " + str +"!");
        else System.out.println("Tiger drink water!");
    }

}
