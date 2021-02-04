package Leetcode;

import java.util.Arrays;

/*
@author lushuai
@date  2021/2/1-13:57
*/
public class Leetcode896 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,4,5};
        int[] nums2 = {1,1,1};
        int[] nums3 = {1,3,2};
        System.out.println(isMonotonic(nums1));
        System.out.println(isMonotonic(nums2));
        System.out.println(isMonotonic(nums3));
    }

    /*
        分类讨论的话，相等的情况不好分析，引入一个标志位
     */
    public static boolean isMonotonic(int[] A) {
        if(A.length<=2) return true;
        int flag = 0;
        for(int i=1;i<A.length;i++){
            if(flag==0){
                //递增
                if(A[i]>A[i-1]){
                    flag = 1;
                    //递减
                }else if(A[i]<A[i-1]){
                    flag = 2;
                }
            }else {
                if(flag==1&&A[i]<A[i-1]){
                    return false;
                }else if(flag==2&&A[i]>A[i-1]){
                    return false;
                }
            }
        }
        return true;
    }
}
