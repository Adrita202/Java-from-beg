// package oop;
public class Encapsulation {
    public static void main(String[] args) {
        Person p=new Person();
        p.setAge(22);
        System.out.println(p.getAge());
    }
    
}
class Person{
    private int age;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

}