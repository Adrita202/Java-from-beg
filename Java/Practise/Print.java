public class Print {
    public static void main(String[] args) {
        Abc ob=new Abc();
        ob.m();
        System.out.println(ob.a);
    }
    
}
class Abc{
    public int a=10;
    public void m(){
        System.out.println("welcome to java");
    }
}