package javacourses.threads;

public class DataRacing {

    public synchronized static void increment() {
        CounterStorage.counter++;
        System.out.println(CounterStorage.counter);
    }
    public static void main(String[] args) throws InterruptedException {
        var myThread1 = new Thread(new MyRunnableCounter());
        var myThread2 = new Thread(new MyRunnableCounter());

        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();

        System.out.println("Summary: " + CounterStorage.counter);
    }
}

class CounterStorage {
    static int counter;
}

class MyRunnableCounter implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            DataRacing.increment();
        }
    }
}