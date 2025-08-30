public class Anonymous {
    public static void main(String[] args) {
       A obj; //reference creation
        new A(); //object creation
        //anonymous object , can't be reused
        new A().show();
        new A().show();

    }
    
}
class A{
    public A(){
        System.out.println("Object created");

    }
    public void show(){
        System.out.println("IN a show");
    }

}