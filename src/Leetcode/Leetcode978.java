package Leetcode;

/*
@author lushuai
@date  2021/2/8-18:08
*/
public class Leetcode978 {
    public static void main(String[] args) {
        int[] nums = {9,4,2,10,7,8,8,1,9};
        System.out.println(maxTurbulenceSize1(nums));
        System.out.println(maxTurbulenceSize2(nums));
    }
    /*
        1.排除法：出现...大 大...和...小 小...的时候，长度变为2
        2.动态规划：和leetcode376类似
     */
    public static int maxTurbulenceSize1(int[] arr) {
        int len = arr.length;
        if(len==1) return 1;
        int maxlen = 1;
        int curlen = 1;
        for(int i=0;i<len-1;i++){
            if(arr[i]<arr[i+1]){
                curlen++;
                //递增
                if(i!=0&&arr[i-1]<arr[i]){
                    curlen = 2;
                }
                maxlen = Math.max(maxlen,curlen);
            }else if(arr[i]>arr[i+1]){
                curlen++;
                //递减
                if(i!=0&&arr[i-1]>arr[i]){
                    curlen = 2;
                }
                maxlen = Math.max(maxlen,curlen);
            }else {
                curlen = 1;
            }
        }
        return maxlen;
    }

    public static int maxTurbulenceSize2(int[] arr) {
        if(arr.length==1) return 1;
        int up = 1,down = 1;
        int res = 1;
        for(int i=1;i<arr.length;i++){
            //递增
            if(arr[i]>arr[i-1]){
                up = down+1;
                down = 1;
            }else if(arr[i]<arr[i-1]){
                down = up+1;
                up = 1;
            }else {
                up = 1;
                down = 1;
            }
            res = Math.max(res,Math.max(up,down));
        }
        return res;
    }
}
