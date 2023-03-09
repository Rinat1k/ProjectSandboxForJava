package javacourses.threads;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread start");

        var myThread1 = new MyThread1();

        myThread1.start();
        System.out.println(myThread1.getState());
        myThread1.join();
        System.out.println(myThread1.getState());
        System.out.println("Main thread finished");

    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println(this.getName() + " started");
        for (int i = 1; i <= 5; i++) {
            System.out.println(this.getName() + ":" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
