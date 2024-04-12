package Encapsulation;

public class A {
    private int x;

    // public int getX() {
    //     return x;
    // }

    // private void setX(int x) {
    //     this.x = x;
    // }

    
}

class B extends A{
    B()
    {
        System.out.println(super.x);
    }
}
