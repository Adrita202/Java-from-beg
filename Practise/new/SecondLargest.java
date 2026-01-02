public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={1,8,3,45,12,2};
        int largest=Integer.MIN_VALUE;
        int seclargest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                seclargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>seclargest && arr[i]!=largest){
                seclargest=arr[i];
            }
        }

        if(seclargest==Integer.MIN_VALUE){
            System.out.println("not found");
        }else{
            System.out.println(seclargest);
        }
    }

}
