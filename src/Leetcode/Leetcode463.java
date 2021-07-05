package Leetcode;

/*
@author lushuai
@date  2021/3/10-15:16
*/
public class Leetcode463 {
    public static void main(String[] args) {

    }
    public static int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0)
                    continue;
                else {
                    if(i==0||grid[i-1][j]==0){
                        res++;
                    }
                    if(i==m-1||grid[i+1][j]==0){
                        res++;
                    }
                    if(j==0||grid[i][j-1]==0){
                        res++;
                    }
                    if(j==n-1||grid[i][j+1]==0){
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
