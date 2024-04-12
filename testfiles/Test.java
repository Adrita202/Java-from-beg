public class Test {
    public static void main(String[] args) {
        // A objA = new A();
        B objB = new B();
        // C objC = new C();
        // A objA2 = new B();
        // // B objB2 = new A();

        // System.out.println(objA.a + objB.a);
        // System.out.println(objB.a);
        // objB.m1();
        // objB.m2();

        // objA2.m1();
        // // objA2.m2();
        objB.getA();
        objB.m1();
        objB.superM1();
    }
}

class A{
    A()
    {
        System.out.println("A class");
    }

    A(int x)
    {
        System.out.println("A class - "+a);
    }

    int a = 5;
    void m1()
    {
        System.out.println("Test1");
    }
}

class B extends A{
    int a = 10;
    B()
    {
        super(5);
        System.out.println("B class");
    }

    @Override
    void m1()
    {
        System.out.println("Test1 - Overriden");
    }

    void m2()
    {
        System.out.println("Test2");
    }

    void getA()
    {
        System.out.println(a);
        System.out.println(super.a);
    }

    void superM1()
    {
        super.m1();
    }
}

class C extends B{

    C()
    {
        super();
    }
}