public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(findingRange(arr, target));
        
    }
    static int findingRange(int[] arr,int key){
        int start=0;
        int end=1;
        while(key>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2; 
            start=temp;
        }
        return bSearch(arr, key, start, end);

    }
    static int bSearch(int[] arr, int key,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(key<arr[mid]){
                end=mid-1;
            }else if(key>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -11111;
    }
}
