public class InnerClassDemo {
    public static void main(String[] args) {
        A obj= new A();
        obj.show();
      //  B obj1=new B();// error
        A.B obj1= obj.new B();
        obj1.config();
    }
}
class A{
    int age;
    public void show(){
        System.out.println("in A show");

    }
    class B{
        public void config(){
            System.out.println("in config");
        }

    }
}
