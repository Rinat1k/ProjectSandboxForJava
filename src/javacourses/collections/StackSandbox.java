package javacourses.collections;

import java.util.Stack;

public class StackSandbox {
    public static void main(String[] args) {
        Stack<Footballer> footballerStack = new Stack<>();
        fillFootballerStack(footballerStack);
        System.out.println(footballerStack.peek());
        System.out.println(footballerStack.peek());
        System.out.println(footballerStack.peek());
        System.out.println(footballerStack.peek());
    }

    static void fillFootballerStack(Stack<? super Footballer> footballerStack) {
        footballerStack.push(new Footballer(1));
        footballerStack.push(new Footballer(2));
        footballerStack.push(new Footballer(3));
        footballerStack.push(new Footballer(4));
    }

}
