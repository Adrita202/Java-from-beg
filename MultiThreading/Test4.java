//MultiThreading using Runnable Interface
public class Test4 {
    public static void main(String[] args) {
        C objC = new C();  //object of C class
        Thread t =new Thread(objC); //object of Thread class
        t.start();
        
    }
    
}
class C implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<6;i++){
            System.out.println(i+"-C");
        }

    }
}