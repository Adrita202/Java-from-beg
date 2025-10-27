public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumdig(505));
        
    }
    static int sumdig(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) + sumdig(n/10);
    }
}
