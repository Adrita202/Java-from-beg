public class MountainArray2 {
    public static void main(String[] args) {
        
    }
    public int search(int[]arr,int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry=OrderAgnosticSearch(arr, target, 0, peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return OrderAgnosticSearch(arr, target, peak+1, arr.length-1);

    }
    public int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //desc part of array, may be the ans but look at left
                end=mid;
        }
        else{//in asc part
            start=mid+1;//as mid+1 element is greater than mid, so ignoring mid element
        }
    }
    //start==end, pointing to the largest el
    return start;

    }
    static int OrderAgnosticSearch(int[] arr,int key,int start,int end){
        
        boolean isAsc=arr[start]<arr[end];
        // if(arr[start]<arr[end]){
        //     isAsc=true;
        // }else
        //     isAsc=false;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==key){
                return mid;
            }
            if (isAsc){
                if(key<arr[mid]){
                    end=mid-1;
                }else if(key>arr[mid]){
                    start=mid+1;
                }
            }else{
                if(key<arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -11111;
    }

}
