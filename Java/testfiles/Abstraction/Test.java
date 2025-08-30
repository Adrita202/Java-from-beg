public class Test {
    public static void main(String[] args) {
        A objC = new C();
        objC.test();

        new D() {
            @Override
            void test5() {
                // System.out.println("This is working now - Test 5");
            }
        }.test();

    }
}

abstract class A{
    abstract void test();

    final void test2()
    {
        System.out.println("Testing test 2");
    }

    static void test6()
    {
        System.out.println("Test static");
    }
}

abstract class B extends A{
    @Override
    void test() {
        System.out.println("This is working now - Test");
    }

    abstract void test3();
    abstract void test4();
}

class C extends B {

    @Override
    void test3() {
        System.out.println("This is working now - Test 3");
    }

    @Override
    void test4() {
        System.out.println("This is working now - Test 4");
    }
}

abstract class D extends C{
    abstract void test5();
}