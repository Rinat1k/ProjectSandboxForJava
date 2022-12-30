package javacourses.homework27;

public class Penguin extends Bird implements Speakable {

    private String name;

    public Penguin(String name) {
        super(name);
        this.name = name;
        System.out.println(this.name + " created!");
    }

    @Override
    public void eat() {
        System.out.println("Penguins loves eat fish");
    }
    @Override
    public void sleep() {
        System.out.println("Penguins sleeps together");
    }
    @Override
    public void fly() {
        System.out.println("Penguins can't fly");
    }
    @Override
    public void speak() {
        System.out.println("Penguins can't sing");
    }
}
