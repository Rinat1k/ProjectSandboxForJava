package javacourses.homework27;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void sleep();
    abstract void eat();

}
