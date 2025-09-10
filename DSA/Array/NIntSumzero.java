public class NIntSumzero {
    public static void main(String[] args) {
        
    }
    static int[] sumZero1(int n) {
        int result[] =new int[n];
        int start=1;
        int i=0;
        while(i+1<n){
            result[i]=start;
            result[i+1]=-start;
            i+=2;
            start++;
        }
        return result;
    }
    static int[] sumZero2(int n){
        int i=0;
        int j=n-1;
        int start=1;
        int[] result=new int[n];
        while(i<j){
            result[i]=start;
            result[j]=-start;

            start++;
            i++;
            j--;
        }
        return result;
    }
}
