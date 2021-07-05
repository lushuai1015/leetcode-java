package Leetcode;

/*
@author lushuai
@date  2021/3/29-9:29
*/
public class LeiQuestion {
    public static void main(String[] args) {
        System.out.println(help(10));
    }
    /*
        转变为0的次数：
        1.n-1
        2.n/2
        3.n/3
     */
    public static int help(int num){
        //每个数字转化为0的次数
        int[] dp = new int[num+1];
        //初始化dp
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 2;
        for(int i=3;i<=num;i++){
            if(i%2==0&&i%3==0){
                dp[i] = Math.min(dp[i-1],Math.min(dp[i/2],dp[i/3]))+1;
            }else if(i%2==0&&i%3!=0){
                dp[i] = Math.min(dp[i-1],dp[i/2])+1;
            }else if(i%2!=0&&i%3==0){
                dp[i] = Math.min(dp[i-1],dp[i/3])+1;
            }else {
                dp[i] = dp[i-1]+1;
            }
        }
        return dp[num];
    }
}
