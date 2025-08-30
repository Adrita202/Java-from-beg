public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("mini");
        int ans=sum(3,4);
        System.out.println(ans);
        int ans2=sum(1,2,3);
        System.out.println(ans2);
    }
    static void fun(int a){
        System.out.println("1st");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("2nd");
        System.out.println(name);
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
}
