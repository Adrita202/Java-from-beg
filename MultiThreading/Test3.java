//MultiThreading using Thread class
public class Test3 {
    public static void main(String[] args) {
        A objA = new A();
        objA.start();
        B objB = new B();
        objB.start();

    }

}

class A extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "-A");
        }
    }
}

class B extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "-B");
        }

    }
}