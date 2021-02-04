package Leetcode;

/*
@author lushuai
@date  2021/1/27-18:18
*/
public class Leetcode42 {
    public static void main(String[] args) {

    }
    /*
        方法一：动态规划
        max_left[i]代表第i列左边最高墙的高度，max_right[i]代表第i列右边最高墙的高度
        方法二：单调栈
        维持一个单调递减的栈：
        1.当前高度小于等于栈顶高度，入栈，指针后移

     */
    public static int trap1(int[] height) {
        int len = height.length;
        int[] max_left = new int[len];
        int[] max_right = new int[len];
        int sum = 0;
        for(int i=1;i<len;i++){
            max_left[i] = Math.max(max_left[i-1],height[i-1]);
        }
        for (int i = len - 2; i >= 0; i--) {
            max_right[i] = Math.max(max_right[i + 1], height[i + 1]);
        }
        for (int i = 1; i < len - 1; i++) {
            int min = Math.min(max_left[i], max_right[i]);
            if (min > height[i]) {
                sum = sum + (min - height[i]);
            }
        }
        return sum;
    }


}
