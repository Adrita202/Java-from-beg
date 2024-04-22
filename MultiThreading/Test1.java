
public class Test1 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread Task");


    }
    public static void main(String[] args) {
        Test1 t =new Test1();
        t.start();
        
    }
     

}