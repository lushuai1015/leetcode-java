package Leetcode;

/*
@author lushuai
@date  2021/1/13-9:30
*/
public class LeetcodeInterview04_02 {
    public static void main(String[] args) {

    }
    /*
        给定一个有序整数数组，元素各不相同且按升序排列，
        编写一个算法，创建一棵高度最小的二叉搜索树。
        和leetcode109类似
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return help(nums,0,nums.length-1);
    }

    private TreeNode help(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        int mid = (right-left)/2+left;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = help(nums,left,mid-1);
        root.right = help(nums,mid+1,right);
        return root;
    }
}
