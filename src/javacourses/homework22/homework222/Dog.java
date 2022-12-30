package javacourses.homework22.homework222;

public class Dog extends Pet {

    public Dog(String name) {
        super.setName(name);
        System.out.println("I'm dog my name is " + super.getName());
    }

    public void plays() {
        System.out.println("Dog plays");
    }

}
