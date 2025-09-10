// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
public class CountNegNum {
    public static void main(String[] args) {
        
    }
    static int countNeg(int[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        int r=n-1;
        int c=0;
        int count=0;
        while(r>=0 && c<m){
            if(grid[r][c]<0){
                count+=(m-c);
                r--;
            }else{
                c++;
            }
        }
        return count;

    }
}
