package javacourses.homework9;

import javacourses.homework8.Calculator;
import static javacourses.homework8.Calculator.PI;

public class Scope {

    int a;
    static int b = 10;

    void abc(final int a) {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(b);
        System.out.println(Scope.b);

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        var a = PI;
        Scope scope = new Scope();
        scope.abc(3);
    }

}
