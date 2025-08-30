import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr={
            {1,5,9},
            {2,4,19,10},
            {77,6,15},
            {12,7}
        };
        int key=15;
        int[] ans =search2D(arr,key);
        System.out.println(Arrays.toString(ans));
        System.out.println(findMax(arr));
        System.out.println(findMax2(arr));
    }
    static int[] search2D(int[][] arr,int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==key){
                    return new int[]{i,j};
                } 
                }
            }
            return new int[]{-101,-101};
        }
        //find maximum value
    static int findMax(int[][] arr){
        // int max=arr[0][0];
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                } 
                }
            }
            return max;
        }
        //using enhanced for loop
    static int findMax2(int[][] arr){
        // int max=arr[0][0];
        int max=Integer.MIN_VALUE;

        for(int[] ints:arr){
            for(int element:ints){
                if(element>max){
                    max=element;
                } 
                }
            }
            return max;
        }
}


