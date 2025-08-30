public class InterfaceDemo {
    public static void main(String[] args) {
        A obj;
        obj=new B();
        obj.show();
        obj.config();
    }
    

    
}
interface A{
    public abstract void show();
     void config();//by default every method in interface is public abstract, so its not necessary to mention
     int age;    //variables inside the interface areby default final and static
    
}
class B implements A{
    public void show(){
        System.out.println("iN show");
    }
    public void config(){
        System.out.println("iN config");
    }
    
}
