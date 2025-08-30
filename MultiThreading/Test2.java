
public class Test2 {
    public static void main(String[] args) {
        // A objA = new A();
        // objA.start();
        // A objA2 = new A();
        // objA2.start();
        // B objB = new B();
        // objB.start();
        // C objC = new C();
        // Thread t = new Thread(objC);
        // t.start();
        customThread t2;
        customThread t1 = new customThread() {
            @Override
            public void run() {
                System.out.println(this.getName());
            }
        };

        t1.start();

        try {
            t2 = (customThread) t1.clone();
            t2.start();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

    }
}

class A extends Thread {
    @Override
    public void run() {
        // Task 1
        for (int i = 0; i < 50; i++) {
            System.out.println(i + " - A");
        }
    }
}

class B extends Thread {
    @Override
    public void run() {
        // Task 2
        for (int i = 0; i < 50; i++) {
            System.out.println(i + "-B");
        }
    }
}

class C implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i + "-C");
        }
    }

}

class customThread extends Thread implements Cloneable {

    // String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // System.out.println(super.toString());
        customThread clone = (customThread) super.clone();
        // clone.name = new String(this.name);
        return clone;
    }

    customThread() {
        super();
    }

    customThread(Runnable task) {
        super(task);
    }

    customThread(ThreadGroup group, Runnable task) {
        super(group, task);
    }

    customThread(String name) {
        super(name);
        // this.name = name;
    }
}