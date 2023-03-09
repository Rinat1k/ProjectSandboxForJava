package javacourses.threads;


class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread is starting\n");

        var whatsapp = new Thread(new WhatsappRunnable());
        var skype = new Thread(new SkypeRunnable());
        var mobile = new Thread(new MobileRunnable());

        whatsapp.start();
        skype.start();
        mobile.start();

        whatsapp.join();
        skype.join();
        mobile.join();

        System.out.println("\nMain thread is ending");
    }
}

public class SocialNetwork {

    private static final Object lock = new Object();

    void whatsappCall() {
        synchronized (lock) {
            System.out.println("WhatsApp call is starting");
            try {
                Thread.sleep(2_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Whatsapp call is ending");
        }
    }

    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call is starting");
            try {
                Thread.sleep(5_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call is ending");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call is starting");
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call is ending");
        }
    }

}

class WhatsappRunnable implements Runnable {
    @Override
    public void run() {
        new SocialNetwork().whatsappCall();
    }
}

class SkypeRunnable implements Runnable {
    @Override
    public void run() {
        new SocialNetwork().skypeCall();
    }
}

class MobileRunnable implements Runnable {
    @Override
    public void run() {
        new SocialNetwork().mobileCall();
    }
}