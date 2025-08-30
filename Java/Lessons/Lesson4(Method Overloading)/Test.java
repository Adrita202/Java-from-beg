public class Test {
    public static void main(String[] args) {
        Test t =new Test();
        t.show();
        t.show(10);
        t.show(10,4);
        t.show("br",1);
        t.show(7.5);
        
        
    }
    void show(){
        System.out.println("1");
    }
    //Different Number of arguments
    void show(int a){
        System.out.println("2");
    }
    void show(int a,int b){
        System.out.println("3");
    }
    //Different seqence of arguments
    void show(int a,String b){
        System.out.println("4");
    }
    void show(String b,int a){
        System.out.println("5");
    }
    //Different types of arguments
    void show(double a){
        System.out.println("7");
    }

    
}
