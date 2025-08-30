//package inheritance;

// Interface A
interface A {
    void methodA();
}

// Interface B
interface B {
    void methodB();
}

// Class C implementing interfaces A and B
class C implements A, B {
    public void methodA() {
        System.out.println("Method A");
    }
    
    public void methodB() {
        System.out.println("Method B");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
