package inheritance;

public class Demo {
    public static void main(String[] args) {
        MoreAdvCalc obj=new MoreAdvCalc();
        int r1 = obj.addition(4,5);
        int r2=obj.subtraction(9, 6);
        int r3=obj.multiplication(9, 7);
        int r4=obj.division(10,5);
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" ");

    }
    
}
