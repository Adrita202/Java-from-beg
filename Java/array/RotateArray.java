public class RotateArray {
    public static void main(String[] args) {
        float arr[]={5.8f,2.6f,9.1f,3.4f,7.0f};
        int n=arr.length;
        rotateRight(arr,n);
        System.out.println("Rotated array:");
        for(float num:arr){
            System.out.print(num+"  ");
        }
        
    }
    public static void rotateRight(float arr[],int n){
        float lastEl=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=lastEl;

    }
    
}
