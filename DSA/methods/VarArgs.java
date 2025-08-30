
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7);
        fun2("me","ji","no","ho");
        multiple(2,3,4,5,6,7,8,9);
        // fun3(1,2,4);
        fun3("vishal","rak","jay");
        
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun2(String ...v){

    }
    static void multiple(int a,int b,int ...v){

    }
    static void fun3(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun3(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
