public class CallFunctionWithReturn {
    public static void main(String[] args) {
        int sum=Add(50,10,30);
        System.out.println(sum);
        int result=sum*10;
        System.out.println(result);
        
    }
    public static int Add(int a,int b,int c) {
        //System.out.println(a+b+c);
        return(a+b+c);
        
    }
    
}
