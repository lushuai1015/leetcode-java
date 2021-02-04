package Leetcode;

import java.util.Arrays;

/*
@author lushuai
@date  2021/1/20-14:36
*/
public class Leetcode628 {
    public static void main(String[] args) {

    }
    /*
        三个数字的最大乘积，在排序后只有三种可能：
        (1)最后三个数：都为正，都为负
        (2)两个最小的负数乘最大的正数
     */
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[len-1]*nums[len-2]*nums[len-3],nums[0]*nums[1]*nums[len-1]);
    }

}
