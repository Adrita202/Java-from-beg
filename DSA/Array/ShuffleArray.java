public class ShuffleArray {
    public static void main(String[] args) {
        
    }
    public int[] shuffle(int[] arr,int n){
        int[] result=new int[2*n];
        for(int i=0;i<n;i++){
            result[2*i]=arr[i];

            result[2*1+1]=arr[i+1];
        }
        return result;
    }
}
