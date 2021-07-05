package Leetcode;

/*
@author lushuai
@date  2021/5/6-13:31
*/
public class Leetcode264 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(1));
        System.out.println(nthUglyNumber(10));
        System.out.println(nthUglyNumber(9));
    }

    /*
        动态规划：dp[i]表示第i个丑数
     */
    public static int nthUglyNumber(int n) {
        int p2 = 1 , p3 = 1 , p5 = 1;
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = Math.min(dp[p2]*2,Math.min(dp[p3]*3,dp[p5]*5));
            if(dp[i]==dp[p2]*2){
                p2++;
            }
            if(dp[i]==dp[p3]*3){
                p3++;
            }
            if (dp[i]==dp[p5]*5){
                p5++;
            }
        }
        return dp[n];
    }


}
