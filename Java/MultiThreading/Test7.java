//setPriority() method

public class Test7 {
    public static void main(String args[]) {
        // creating one thread
        P1 t1 = new P1();
        // print the maximum priority of this thread
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        P2 t2 = new P2();
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();

        P3 t3 = new P3();
        t3.setPriority(Thread.NORM_PRIORITY); 
        t3.start();   
    
    }

}

class P1 extends Thread {
    public void run() {
        System.out.println("Priority of thread is: " + Thread.currentThread().getPriority());

    }
}

class P2 extends Thread {
    public void run() {
        System.out.println("Priority of thread is: " + Thread.currentThread().getPriority());

    }
}
class P3 extends Thread {
    public void run() {
        System.out.println("Priority of thread is: " + Thread.currentThread().getPriority());

    }
}