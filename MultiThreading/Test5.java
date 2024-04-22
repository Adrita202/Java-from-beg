//Single Task from Multiple Thread
public class Test5 {
    public static void main(String[] args) {
        A thread1 = new A();
        thread1.start();

        A thread2 = new A();
        thread2.start();

        A thread3 = new A();
        thread3.start();

    }

}

class A extends Thread {
    public void run() {
        System.out.println("Task 1");
    }
}