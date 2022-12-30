package javacourses.homework27;

public abstract class Fish extends Animal {

    private String name;

    public Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.println("Always interesting watch how sleeps fishes");
    }

    abstract void swim();

}
