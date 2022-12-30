package javacourses.homework27;

public class Main {
    public static void main(String[] args) {

        Mechenosec mechenosec = new Mechenosec("Mechenosec Jack");
        mechenosec.sleep();
        mechenosec.swim();
        mechenosec.eat();

        System.out.println();

        Speakable speakable = new Penguin("Penguin Frank");
        speakable.speak();

        System.out.println();

        Animal animal = new Lion("Lion Alex");
        animal.eat();
        animal.sleep();

        System.out.println();

        Mammal mammal = new Lion("Lion Grisha");
        mammal.sleep();
        mammal.run();
        mammal.speak();
        mammal.eat();

        Speakable [] speakables = {mammal, speakable};
        Animal[] animals = new Animal[] {mechenosec, mammal, animal};

        showPolymorph(speakables);
        showPolymorph(animals);
    }

    private static void showPolymorph(Object[] objects) {
        System.out.println("Poly: ");
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Animal)
                ((Animal) objects[i]).eat();
            if (objects[i] instanceof Bird)
                ((Bird) objects[i]).eat();
            if (objects[i] instanceof Mammal)
                ((Mammal) objects[i]).eat();
            if (objects[i] instanceof Speakable)
                ((Speakable) objects[i]).speak();
            if (objects[i] instanceof Mechenosec)
                ((Mechenosec) objects[i]).eat();
        }
    }
}
