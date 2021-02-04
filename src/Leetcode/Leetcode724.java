package Leetcode;

/*
@author lushuai
@date  2021/1/28-0:40
*/
public class Leetcode724 {
    public static void main(String[] args) {
        int[] num = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(num));
    }
    public static int pivotIndex(int[] nums) {
        if(nums.length==0) return -1;
        int sum = 0;
        for(Integer i:nums){
            sum +=i;
        }
        int sumleft = 0;
        for(int i=0;i<nums.length;i++){
            if(sum==sumleft*2+nums[i]){
                return i;
            }
            sumleft += nums[i];
        }
        return -1;
    }
}
