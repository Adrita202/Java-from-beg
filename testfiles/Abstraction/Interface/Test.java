package Abstraction.Interface;

public class Test {
    public static void main(String[] args) {
        
    }
}

interface A{
    abstract void test();
    abstract void test2();

    default void test3()
    {

    }
    static void test4(){}
}

abstract class B implements A{

    @Override
    public void test() {
       System.out.println("perechi");
    }

}

class C extends B{

    @Override
    public void test2() {
    }

}

interface X {
    abstract void method1();
}

interface Y{
    abstract void method1();
}

interface Z extends X
{
    void method2();
}

class XYZ implements X,Y,Z{

    @Override
    public void method2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'method2'");
    }

    @Override
    public void method1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'method1'");
    }

}
