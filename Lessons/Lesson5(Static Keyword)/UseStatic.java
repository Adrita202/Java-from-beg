// package Lesson5(Static Keyword);

public class UseStatic {
    public static void main(String[] args) {
        //Static members belong to the class instead of a specific instance
        Hello hello=new Hello();
        hello.doSomething("HIIIII");//wrong way as the method is static
        Hello.doSomething("HIIIII");//accessing directly with class name not the instance
        Hello.age=10;
        System.out.println(Hello.age);
        Hello hello2=new Hello();
        // hello2.age=50;
        // System.err.println(hello2.age);
        hello2.doSomethingElse("HIIIII");//As the method was non static, it can be accessed by object
    }
    
}
class Hello{
    //static method
    public static String doSomething(String msg){
        return msg;
    }
    //non static method
    public String doSomethingElse(String msg){
        return msg;
    }
    public static int age;
}
