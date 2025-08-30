



public class WideningTypeCasting
{  
    public static void main(String[] args)  
    {  
        int x = 7;  //automatically converts the int into long  
        long y = x; //automatically converts the long into float  
        float z = y;  
        System.out.println("Before conversion, int value "+x);  
        System.out.println("After conversion,long value "+y);  
        System.out.println("After conversion,float value "+z);  
    }  
}  