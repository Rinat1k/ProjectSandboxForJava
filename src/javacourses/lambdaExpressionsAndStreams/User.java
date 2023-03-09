package javacourses.lambdaExpressionsAndStreams;

import java.util.Objects;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User - " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) return false;
        if (this == obj) return true;
        return this.name.equals(((User) obj).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

}
