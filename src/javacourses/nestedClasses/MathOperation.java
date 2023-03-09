package javacourses.nestedClasses;

@FunctionalInterface
public interface MathOperation<T> {
    T doOperation(T val1, T val2);
}
