public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,3,89,7,66,-4,6,77,-1,-65};
        int res=search(arr,0);
        if(res==-1){
            System.out.println("element not found");
        }else{
            System.out.println("element found at index:"+res);
        }
    }
    static int search(int[] arr,int key){
        if(arr.length==0)
        {
            return -11111111;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            } 
        }
        return -1;
    }
}

