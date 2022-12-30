package javacourses.homework22.homework222;

public class Pet extends Animal{
    private String name;
    private int numberOfTail;
    private int numberOfPaw;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfTail() {
        return numberOfTail;
    }

    public void setNumberOfTail(int numberOfTail) {
        this.numberOfTail = numberOfTail;
    }

    public int getNumberOfPaw() {
        return numberOfPaw;
    }

    public void setNumberOfPaw(int numberOfPaw) {
        this.numberOfPaw = numberOfPaw;
    }

    public Pet() {
        System.out.println("I'm pet");
        super.setNumberOfEyes(2);
        this.numberOfTail = 1;
        this.numberOfPaw = 4;
    }

    public void runs() {
        System.out.println("Pet runs");
    }

    public void jumps() {
        System.out.println("Pet jumps");
    }

}
