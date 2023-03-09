package javacourses.collections;

public class Footballer {
    int skill;

    Footballer(int skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return String.valueOf(skill);
    }
}
