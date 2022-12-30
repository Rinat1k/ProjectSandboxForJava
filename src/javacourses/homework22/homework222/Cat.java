package javacourses.homework22.homework222;

public class Cat extends Pet {

    public Cat(String name) {
        super.setName(name);
        System.out.println("I'm cat my name is " + super.getName());
    }

    public void sleeps() {
        System.out.println("Cat sleeps");
    }

}
