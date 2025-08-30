public class MaxItem {
    public static void main(String[] args) {
        int[] arr={1,3,89,7,66,101,4,0,9};
        // System.out.println(Max(arr));
        System.out.println(MaxRange(arr,0, 3));
    }
    // static int Max(int[] arr){
    //     // int max=arr[0];
    //     int max=Integer.MIN_VALUE; 
    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //         }
    //     }
    //     return max;
    // }
    // 
    static int MaxRange(int[] arr,int start,int end){

        if(end>start){
            return -1;
        }
        // int max=arr[0];
        int max=Integer.MIN_VALUE; 
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
    

