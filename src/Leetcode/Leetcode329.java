package Leetcode;

/*
@author lushuai
@date  2021/1/11-21:37
*/
public class Leetcode329 {
    public static void main(String[] args) {

    }
    /*
        DFS+记忆化：一道不错的题，和力扣200相似
        DFS：非常直观，从每一个单元格开始进行深度优先搜索，即可找到从该单元格开始的最长递增路径。
        遍历所有单元格后，即可得到矩阵中最长递增路径长度

        朴素的深度优先搜索会重复计算，一个单元格会被访问多次
        DFS+递归
     */

    //代表上下左右四个方向
    private  int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    private int row,col;
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return 0;
        }
        int res = 0;
        row = matrix.length;
        col = matrix[0].length;
        int[][] memo = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res = Math.max(res,dfs(matrix,i,j,memo));
            }
        }
        return res;
    }

    private int dfs(int[][] matrix,int i,int j,int[][] memo){
        //如果不等于0，说明遍历过这个点，直接返回即可
        if(memo[i][j]!=0){
            return memo[i][j];
        }
        memo[i][j]++;
        //上下左右遍历四个方向
        for(int[] dir:dirs){
            int newRow = i+dir[0];
            int newCol = j+dir[1];
            if(newRow>=0&&newCol>=0&&newRow<row&&newCol<col&&matrix[newRow][newCol]>matrix[i][j]){
                memo[i][j] = Math.max(memo[i][j],dfs(matrix,newRow,newCol,memo)+1);
            }
        }
        return memo[i][j];
    }
}
