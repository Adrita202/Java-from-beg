public class Test4 {
    void Show(int a){
        System.out.println("int method");
    }
    void Show(int...a){
        System.out.println("Varargs method");
    }
    public static void main(String[] args) {
        Test4 t4=new Test4();
        t4.Show(10);
        t4.Show(10,5,3,7);
        t4.Show();
    }
}
