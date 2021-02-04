package Leetcode;

/*
@author lushuai
@date  2021/1/13-8:47
*/
public class Leetcode542 {
    public static void main(String[] args) {

    }
    /*
        01矩阵：一个由0和1组成的矩阵，找出每个元素到最近的0的距离
        DP,DFS,BFS三种做法
     */

    public int[][] updateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        //第一次遍历初始化
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    dp[i][j] = 0;
                }else {
                    dp[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        //第二次遍历，从左上到右下
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i-1>=0){
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + 1);
                }
                if (j - 1 >= 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + 1);
                }
                }
            }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i + 1 < m) {
                    dp[i][j] = Math.min(dp[i][j], dp[i + 1][j] + 1);
                }
                if (j + 1 < n) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j + 1] + 1);
                }
            }
        }
        return dp;
    }
}
