package Leetcode;

/*
@author lushuai
@date  2021/1/8-17:24
*/
public class Leetcode11 {
    public static void main(String[] args) {
        int[] height = {4,3,2,1,4};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        //对撞指针法
        int left = 0;
        int right = height.length-1;
        int res = 0;
        int area = 0;
        while(left<right){
            area = (right-left)*Math.min(height[left],height[right]);
            res = Math.max(res,area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}
