package Leetcode;

import java.util.Arrays;

/*
@author lushuai
@date  2021/2/1-14:24
*/
public class Leetcode905 {
    public static void main(String[] args) {
        int[] num = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity1(num)));
    }
    /*
        方法1：双指针
        方法2：基于快速排序
     */
    public static int[] sortArrayByParity1(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        int l = 0;
        int r = len-1;
        for(int i=0;i<len;i++){
            if(A[i]%2==0){
                B[l] = A[i];
                l++;
            }else {
                B[r] = A[i];
                r--;
            }
        }
        return B;
    }
}
