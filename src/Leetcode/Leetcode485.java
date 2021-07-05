package Leetcode;

/*
@author lushuai
@date  2021/2/15-13:33
*/
public class Leetcode485 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};

    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int res = 0 ,cur = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cur++;
            }else{
                cur = 0;
            }
            res = Math.max(res,cur);
        }
        return res;
    }
}
