package Leetcode;

/*
@author lushuai
@date  2021/2/7-14:51
*/
public class Leetcode1004 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(arr,2));
    }

    //滑动窗口
    public static int longestOnes(int[] A, int K) {
        int res = 0;
        int count0 = 0; //0的个数
        for(int l=0,r=0;r<A.length;r++){
            if(A[r]==0){
                count0++;
            }
           while (count0>K){
                if(A[l++]==0){
                    count0--;
                }
           }
           res = Math.max(res,r-l+1);
        }
        return res;
    }
}
