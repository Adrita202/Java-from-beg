public class Stringreverse {
    public void reverseString(char[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public void swap(char[] arr,int index1,int index2){
        char temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}