// package Test;

import java.lang.annotation.Inherited;

public class Test1 {
    public static void main(String[] args) {
        // AA obj1 = new AA();
        // A.fly();
        // obj1.run();
        // System.out.println(A.a);
        // System.out.println(obj1.b);

        // AAA obj2 = new AAA();
        // obj2.run();
        // obj2.swim();
        // obj2.fly();

        // A obj3 = new A();
        // A obj4 = new AA();
        // AA obj5 = new AAA();
        AA obj6 = new AAA();

        // obj5.swim();
        obj6.swim();

        // AA obj6;
        // obj6 = (AA)obj5;
        
    }
}

class A{
    static int a;
    String b;

    A()
    {
        System.out.println("Const A");
    }

    A(int a)
    {
        System.out.println("Const A - "+a);
    }

    void run()
    {
        System.out.println("Run A");
    }

    static void fly()
    {
        System.out.println("Fly A");
    }

}

class AA extends A{
    AA()
    {
        this(5);
        // super();
        System.out.println("Const AA");
    }
    
    AA (int a)
    {
        super(a);
        System.out.println("AA -"+ a);
    }


    void swim()
    {
        System.out.println("Swiming AA");
    }
}

class AAA extends AA{
    AAA()
    {
        super();
        System.out.println("Const AAA");
    }

    AAA(int a)
    {
        super(a);
        System.out.println("AAA -"+a);
    }

    @Override
    void swim()
    {
        // super.swim();
        System.out.println("Swiming AAA");
    }

    void run()
    {
        System.out.println("Running AAA");
    }

    static void fly()
    {
        System.out.println("Flying AAA");
    }

    void jump()
    {
        System.out.println("Jumping AAA");
    }
}

