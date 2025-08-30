public class MethodOverloadingEx{
    public static void main(String[] args){
        A obj=new A();
        obj.add(5,2);
        obj.add(4,6,2);
        obj.add(5.6,1.2);

    }

}
class A{
    public void add(int i ,int j){
        System.out.println((i+j));
    }
    public void add(int i ,int j,int k){
        System.out.println((i+j+k));
    }
    public void add(double i ,double j){
        System.out.println((i+j));
    }
}