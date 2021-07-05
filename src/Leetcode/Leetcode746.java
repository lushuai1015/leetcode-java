package Leetcode;

/*
@author lushuai
@date  2021/5/5-15:11
*/
public class Leetcode746 {
    public static void main(String[] args) {
        int[] cost1 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(cost1));
        int[] cost2 = {10, 15, 20};
        System.out.println(minCostClimbingStairs(cost2));
    }

    /*
        最小花费爬楼梯问题：
        dp[i] = min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2])
     */
    public static int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if(len==2) return Math.min(cost[0],cost[1]);
        //dp表示爬到第i个阶梯最少耗费的体力
        int[] dp = new int[len+1];

        for(int i=2;i<len+1;i++){
            dp[i] = Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[len];

    }
}
