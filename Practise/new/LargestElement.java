public class LargestElement {
    public static void main(String[] args) {
        int arr[]={1,8,6,11,7,13,2};
        int largest=arr[0];
        // int seclargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];

            }
        }
    }

}
