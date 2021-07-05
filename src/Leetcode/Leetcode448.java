package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
@author lushuai
@date  2021/2/13-10:53
*/
public class Leetcode448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers1(nums));
        System.out.println(findDisappearedNumbers2(nums));
    }
    /*
        找到数组中消失的数字，不使用额外空间，原地交换
     */
    //方法1：使用额外空间
    public static List<Integer> findDisappearedNumbers1(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[nums[i]-1]++;
        }
        List<Integer> list  = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                list.add(i+1);
            }
        }
        return list;

    }
    //方法2：不使用额外空间
    public static List<Integer> findDisappearedNumbers2(int[] nums){
            List<Integer> res=new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                while (nums[i]!=nums[nums[i]-1]&&nums[i]!=i+1){
                    int tem=nums[i];
                    nums[i]=nums[tem-1];
                    nums[tem-1]=tem;
                }
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=i+1){
                    res.add(i+1);
                }
            }
            return res;
    }


}
