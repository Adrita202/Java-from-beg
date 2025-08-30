//method overloading
class Calculator{
    int num;//Instance variable
    public int add(int n1,int n2){
        return n1+n2;//n1,n2 are local variable

    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;

    }
    public double add(double n1,int n2){
        return n1+n2;

    }
    

}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        int r1=obj.add(3,4,9);
        System.out.println(r1);
    }

    
}
