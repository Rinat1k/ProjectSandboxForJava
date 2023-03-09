package javacourses.lambdaExpressionsAndStreams;

@FunctionalInterface
public interface UserBuilder {
    User create(String name);
}
