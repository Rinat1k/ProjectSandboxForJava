package javacourses.homework27;

public class Lion extends Mammal {

    private String name;

    public Lion(String name) {
        super(name);
        this.name = name;
        System.out.println(this.name + " created!");
    }

    @Override
    public void eat() {
        System.out.println("Lions love meat!!");
    }

    @Override
    public void sleep() {
        System.out.println("Lions love sleep");
    }

    @Override
    public void run() {
        System.out.println("Lions doesn't the most fastest cat :(");
    }

}
