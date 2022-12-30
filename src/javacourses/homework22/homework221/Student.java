package javacourses.homework22.homework221;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        if (name.length() >= 3) {
            this.name = name;
        } else throw new IllegalArgumentException("Name's length can't be lower 3 symbols");
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course <= 4 && course >= 0) {
            this.course = course;
        } else throw new IllegalArgumentException("Course can't be lower 0 and upper 10");
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade <= 10 && grade >= 0) {
            this.grade = grade;
        } else throw new IllegalArgumentException("Grade can't be lower 0 and upper 10");
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "; Course: " + getCourse() + "; Grade: " + getGrade();
    }
}
