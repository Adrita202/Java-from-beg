public class Test3 {
    // void show(int a,float b){
    //     System.out.println("int float method");
    // }
    void show(String a ,int b){
        System.out.println("int float method");
    } 

    void show(float a ,int b){
        System.out.println("float int method");
    }    

    public static void main(String[] args) {
        Test3 t=new Test3();
        //t.show(10,20.5f);//int float method
        t.show(2.8f,5);//float int method
        t.show(10,6);//Automatic promotion not applied
        t.show("abc",20);//int float method
    }

}
