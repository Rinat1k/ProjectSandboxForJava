package javacourses.homework27;

public abstract class Bird extends Animal implements Speakable {

    private String name;

    public Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(this.name + " sings");
    }

}
