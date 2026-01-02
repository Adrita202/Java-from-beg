// package oop;
public class Inheritance {
    public static void main(String[] args) {
        Dog a=new Dog();
        a.eat();
        a.bark();
    }
    
}
class Animal{
    void eat(){
        System.out.println("animals eat");
    }

}
class Dog extends Animal{
    void bark(){
        System.out.println("dogs bark");
    }

}