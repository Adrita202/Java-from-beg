public class Test2 {
    void show(Object a){
        System.out.println("Object method");
    }
    // void show(int a){
    //     System.out.println("Int method");
    // }
    void show(String a){
        System.out.println("String method");

    }
    public static void main(String[] args) {
        Test2 t=new Test2();
        t.show('a');
        t.show("abc");
    }
    
}
