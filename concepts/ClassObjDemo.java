public class ClassObjDemo {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        obj.add();
        
    }
    
}
class Calculator{
    int a;
    public int add(){
        System.out.println("adding...");
        return 0;
    }

}