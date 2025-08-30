//Multiple task from multiple thread
public class Test6 {
    public static void main(String[] args) {
        M objM = new M();
        objM.start();

        N objN = new N();
        objN.start();

        O objO = new O();
        objO.start();

    }

}

class M extends Thread {
    public void run() {
        System.out.println("Task-1");

    }
}

class N extends Thread {
    public void run() {
        System.out.println("Task-2");

    }
}

class O extends Thread {
    public void run() {
        System.out.println("Task-3");

    }
}
