package javacourses.homework27;

public class Mechenosec extends Fish {

    private String name;

    public String getName() {
        return this.name;
    }

    public Mechenosec(String name) {
        super(name);
        this.name = name;
        System.out.println(this.name + " created!");
    }

    @Override
    public void swim() {
        System.out.println("Mechenosec beautiful fish which fast swim");
    }

    @Override
    public void eat() {
        System.out.println("Mechenosec doesn't predator, it eat feed");
    }

}

