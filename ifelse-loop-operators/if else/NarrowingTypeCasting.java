

public class NarrowingTypeCasting
{  
    public static void main(String args[])  
    {  
        double d = 166.66;  //converting double into long
        long l = (long)d;  //converting long  into int 
        int i = (int)l;  
        System.out.println("Before conversion: "+d); //fractional part lost  
        System.out.println("After conversion into long type: "+l);  
        System.out.println("After conversion into int type: "+i);  
    }  
}  
