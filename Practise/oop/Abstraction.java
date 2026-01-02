// package oop;
public class Abstraction {
    public static void main(String[] args) {
        Shape s=new Circle();
        s.draw();
    }

}
abstract class Shape{
    abstract void draw();
    void info(){
        System.out.println("Its a shape");
    }


}
class Circle extends Shape{
    void draw(){
        System.out.println("drawing a circle");
    }
}