// https://leetcode.com/problems/valid-mountain-array/description/
public class ValidMountainArray {
    public static void main(String[] args) {
        
    }
    //bad approach
    // static boolean valid1(int[] arr){
    //     if(arr.length<3){
    //         return false;
    //     }
    //     int i=0;
    //     for(;i<arr.length-1;i++){
    //         if(arr[i]>arr[i+1]){
    //             i++;
    //             break;
    //         }else if(arr[i]==arr[i+1]){
    //             return false;
    //         }
    //     }
    //     if(i<2)
    //         return false;
    //     for(;i<arr.length;i++){
    //         if(arr[i-1]<=arr[i]){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    static boolean valid2(int[] arr){
        if(arr.length<3)
            return false;
        int max=arr[0];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        if(index==0 || index==arr.length-1)
            return false;
        for(int i = 0; i < index; i++){ 
            if(arr[i] >= arr[i+1]) 
                return false; 
        }
        for(int i = index; i < arr.length - 1; i++){
            if(arr[i] <= arr[i+1]) 
                return false;
        } 
        return true;
    } 
    static boolean valid3(int[] arr){
        int n=arr.length;
        int i=0;int j=n-1;
        while(i+1<n && arr[i]<arr[i+1])
            i++;
        while(j>0 && arr[j-1]>arr[j])
            j--;
        if(i>0 && i==j && j<n-1)
            return true;
        return false;
    }

}
