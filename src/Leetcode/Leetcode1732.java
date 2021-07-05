package Leetcode;

/*
@author lushuai
@date  2021/2/7-15:06
*/
public class Leetcode1732 {
    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }

    public static int largestAltitude(int[] gain) {
        int res = 0;
        int height = 0;
        for(int i=0;i<gain.length;i++){
            height = height+gain[i];
            res = Math.max(res,height);
        }
        return res;
    }
}
