package Leetcode;

import java.util.Arrays;

/*
@author lushuai
@date  2021/1/11-17:31
*/
public class LeetcodeInterview17_10 {
    public static void main(String[] args) {
        int[] num1 = {1,2,5,9,5,9,5,5,5};
        int[] num2 = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(num1));
        System.out.println(majorityElement(num2));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int res = nums[len/2];
        int count = 0;
        for(Integer i:nums){
            if(i==res)
                count++;
        }
        if(count>len/2) return res;
        return -1;
    }
}
