import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> l;

    }
}

class B {
    static int x = 15;

    static int getX() {
        return x;
    }
}

class A {

    int a;
    float b;
    static int c = B.getX();

    // if(a==4)
    // {
    // b = 10;
    // }

    A() {
        System.out.println("Constructor");
        System.out.println(a + " " + b + " " + c);
    }

    {
        System.out.println("Block 2");
    }
    // Initializer block
    {
        a = 4;
        b = 5.6f;
        System.out.println("Initializer block");
    }

    static {
        // c = 10;
        System.out.println("Static block");
    }

}