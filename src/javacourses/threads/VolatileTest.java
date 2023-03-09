package javacourses.threads;

public class VolatileTest extends Thread{
    volatile static int value = 0;

    @Override
    public void run() {
        int counter = 0;
        System.out.println(this.getName() + " started");
        for (int i = 0; i < 10000; i++) {
            System.out.println(++value);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start Main thread");
        var myThread = new VolatileTest();
        var myThread1 = new VolatileTest();
        myThread.start();
        myThread1.start();
        myThread.join();
        myThread1.join();
        System.out.println("End of Main thread");
        System.out.println(value);
    }
}
