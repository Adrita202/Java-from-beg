
public class Test8 {

    public static void main(String args[]) {
        // creating one thread
        X t1 = new X();
        Y t2 = new Y();
        // set the priority
        t1.setPriority(4);
        t2.setPriority(7);
        // print the user defined priority
        System.out.println("Priority of thread t1 is: " + t1.getPriority()); // 4
        // System.out.println("Priority of thread t2 is: " + t2.getPriority()); // 7
        // this will call the run() method
        t1.start();
    }
}

class X extends Thread {
    public void run() {
        System.out.println("running...");
    }
}

class Y extends Thread {
    public void run() {
        System.out.println("running...");
    }
}
