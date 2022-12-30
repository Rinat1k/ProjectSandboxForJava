package javacourses.homework26;

import javacourses.homework22.homework222.Animal;

public class Pet extends Animal {

    public Pet() {
    }


    public static void sound(int a) {
        System.out.println("Pet sound");
    }


    public static void main(String[] args) {
        Pet pet = new Pet();
    }
}


class B {
    public void foo() {
        System.out.println("Class B");
    }
}

abstract class A extends B {
    abstract void fooA();
    abstract void fooA(int a);
    void fooA(double a) {}
}

class C extends A {
    public void fooA() {}
    protected void fooA(int a) {}
}