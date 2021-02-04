package Leetcode;

import com.sun.org.apache.bcel.internal.generic.LNEG;

/*
@author lushuai
@date  2021/2/1-17:25
*/
public class Leetcode918 {
    public static void main(String[] args) {
        int[] nums = {1,-2,3,-2};
        System.out.println(maxSubarraySumCircular(nums));
    }

    public static int maxSubarraySumCircular(int[] A) {
        if(A.length==1) return A[0];
        int len = A.length;
        int[] arr = new int[len*2];
        for(int i=0;i<len;i++){
            arr[i] = A[i];
        }
        for(int i=0;i<len;i++){
            arr[i+len] = A[i];
        }
        return maxSubArray(arr);
    }
    public static int maxSubArray(int[] nums) {
        //dp[i]表示以i结尾的最大连续子数组之和
        int len = nums.length;
        int[] dp = nums;
        int max = dp[0];
        for(int i=1;i<len;i++){
            //以i结尾，所以nums[i]必须加，如果dp[i-1]小于0，就都可以不要，如同初始化的那样
            dp[i] = nums[i]+(dp[i-1]>0 ? dp[i-1] : 0);
            max = Math.max(dp[i],max);
        }
        return max;
    }
}
