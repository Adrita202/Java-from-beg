public class OrderAgnosticBSearch {
    public static void main(String[] args) {
        // int[] arr={-18,-9,-3,-4,-1,6,8,12,99,156,2023};
        int[] arr={99,80,69,45,3,1,-2,-13,-76};
        int ans=OrderAgnosticSearch(arr,-2);
        if(ans!=-11111){
            System.out.println("Element found at index "+ans);
        }
        else
            System.out.println("element not found");
        
    }
    static int OrderAgnosticSearch(int[] arr,int key){
        int start=0;
        int end=arr.length-1;
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
