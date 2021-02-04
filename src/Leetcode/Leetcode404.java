package Leetcode;

/*
@author lushuai
@date  2021/1/20-16:34
*/
public class Leetcode404 {
    public static void main(String[] args) {

    }

    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        int res = 0;
        if(root.left!=null&&root.left.left==null&&root.left.right==null){
            res = res+root.left.val;
        }
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right)+res;
    }
}
