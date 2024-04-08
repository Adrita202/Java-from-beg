public class StaticVariableDemo {
    public static void main(String[] args) {
        
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=80000;
       // obj1.name="Phone"; // static variable is shared by all the objects
        Mobile.name="smartphone";
        //static variable can be called using a class name

        Mobile obj2=new Mobile();
        obj2.brand="Blackberry";
        obj2.price=60000;
        obj1.show();
        obj2.show();

        
    }
    
}
class Mobile{
    String brand;//instance variables
    int price;
    static String name;
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);

    }
}
