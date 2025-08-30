class HelloThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("HELLO");
        }
    }
}

class HiThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("HI");
        }
    }
}

public class ThreadMessages {
    public static void main(String[] args) {
        HelloThread hello = new HelloThread();
        HiThread hi = new HiThread();

        hello.start();
        hi.start();
    }
}

