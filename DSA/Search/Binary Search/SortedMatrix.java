public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr={
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        
    }
    static int[] BinarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cStart=mid+1;
            }else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        if(rows==1){
            return BinarySearch(matrix, 0,0, cols-1, target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;
        //run loop till 2 rows are remaining
        while(rStart<(rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
        }
        return new int[]{-1,-1};
    }
}
