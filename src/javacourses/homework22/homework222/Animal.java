package javacourses.homework22.homework222;

public class Animal {

    protected int numberOfEyes;

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        if (numberOfEyes > 0) this.numberOfEyes = numberOfEyes;
        else throw new IllegalArgumentException("Number of eyes can't be lower 0");
    }

    protected void sound() {
        System.out.println("Animal sound");
    }

    public Animal() {
        System.out.println("I'm animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drink");
    }

}
