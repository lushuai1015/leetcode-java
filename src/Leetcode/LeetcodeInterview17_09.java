package Leetcode;

/*
@author lushuai
@date  2021/5/6-20:18
*/
public class LeetcodeInterview17_09 {
    public static void main(String[] args) {
        System.out.println(getKthMagicNumber(5));
    }
    /*
        第k个数，和丑数2很像，DP，dp[i]表示第i个符合要求的数字
     */
    public static int getKthMagicNumber(int k) {
        int[] dp = new int[k+1];
        dp[1] = 1;
        int p3 = 1 , p5 = 1 , p7 = 1;
        for(int i=2;i<=k;i++){
            dp[i] = Math.min(dp[p3]*3,Math.min(dp[p5]*5,dp[p7]*7));
            if(dp[i]==dp[p3]*3){
                p3++;
            }
            if(dp[i]==dp[p5]*5){
                p5++;
            }
            if(dp[i]==dp[p7]*7){
                p7++;
            }
        }
        return dp[k];
    }
}
