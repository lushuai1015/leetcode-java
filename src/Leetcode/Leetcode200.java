package Leetcode;

/*
@author lushuai
@date  2021/1/11-20:38
*/
public class Leetcode200 {
    public static void main(String[] args) {

    }
    /*
        岛屿数量：DFS典型题。
        可以把递归函数当做感染函数
     */
    public static int numIslands(char[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        int res = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    //结果加1并进入递归，直至全部感染
                    res++;
                    dfs(grid,i,j,row,col);
                }
            }
        }
        return res;
    }
    private static void dfs(char[][] grid,int i,int j,int row,int col){
        if(i<0||i>=row||j<0||j>=col) return;
        if(grid[i][j]=='0'){
            return;
        }else {
            grid[i][j] = '0';
        }
        dfs(grid,i+1,j,row,col);
        dfs(grid,i-1,j,row,col);
        dfs(grid,i,j+1,row,col);
        dfs(grid,i,j-1,row,col);
    }
}
