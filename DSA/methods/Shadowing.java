public class Shadowing{
    static int x=90;//this will be shadowed...
    public static void main(String[] args) {
        System.out.println(x);
        
        int x=10;//class variable at line 2 is shadowed by this
        System.out.println(x);
        fun();//90
    }
    static void fun(){
        System.out.println(x);
    }
}