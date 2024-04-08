public class ConstructorOverloadingEx {
    public static void main(String[] args) {
        A obj= new A(4,5,"add");
    }
    
}
class A{
    int num1;
    int num2;
    String operation;
    public A()
    {
        num1=0;
        num2=0;
        operation="Nothing";
    }
    public A(int i){
        num1=i;
        num2=0;
        operation="Nothing";
    }
    public A(int i,int j){
        num1=i;
        num2=0;
        operation="Nothing";
    }
    public A(int i,int j, String Op){
        num1=i;
        num2=j;
        operation="Op";
    }
}