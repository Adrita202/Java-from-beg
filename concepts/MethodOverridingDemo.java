public class MethodOverridingDemo {
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
        obj.config();


    }
    
}
class A{
    public void show(){
        System.out.println("in A show");
    }
    public void config(){
        System.out.println("in A Config");
    }
    
}
class B extends A{
    @Override
    public void show(){
        System.out.println("In B show");
    }

}