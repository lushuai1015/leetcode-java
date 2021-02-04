package Leetcode;

/*
@author lushuai
@date  2021/2/4-13:59
*/
public class Leetcode643 {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));
    }
    /*
     子数组的最大平均数：滑动窗口
     */
    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double maxSum = 0;
        //初始化sum
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        maxSum = sum;
        for(int i=k;i<nums.length;i++){
            sum = sum+nums[i]-nums[i-k];
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum/k;
    }
}
