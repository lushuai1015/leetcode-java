package Leetcode;

import java.util.HashMap;
import java.util.Map;

/*
@author lushuai
@date  2021/1/8-15:13
*/
public class Leetcode01 {
    public static void main(String[] args) {
        int[] nums={2, 7, 11, 15};
        int target=9;
        int[] a=twoSum1(nums,target);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        // System.out.println(twoSum1(nums,target));
    }

    public static int[] twoSum1(int[] nums,int target){
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                res[0] = i;
                res[1] = map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }
        return res;
    }

    public static int[] twoSum2(int[] nums,int target){
        int result[] = new int[2];      //定义固定长度为2的数组

        for(int i=0;i<nums.length;i++)
        {
            int m=target-nums[i];
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==m&&j!=i){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}
