
abstract class Car{
    public abstract void drive();
    public  void playMusic(){
        System.out.println("Playing Music");
    }
}
class GWagon extends Car{
    public void drive(){
        System.out.println("Driving");
    }
    
}
public class Demo{
    public static void main(String[] args) {
        Car obj=new GWagon();
        obj.drive();
        obj.playMusic();
        
    }
}