public class PrintNum {
    public static void main(String[] args) {
        printNRev(7);
        printN(7);
    }
    static void printNRev(int n){
        if(n==0){
            return;
            
        }
        
        printNRev(n-1);
        System.out.println(n);
    }
    static void printN(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printN(n-1);;
    }
}
