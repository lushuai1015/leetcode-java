package Leetcode;

/*
@author lushuai
@date  2021/1/13-13:19
*/
public class Leetcode109 {
    public static void main(String[] args) {
        
    }
    /*
        二分查找+递归：这里的二分查找指的是寻找链表中间节点
     */
    public static TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        else if(head.next==null) return new TreeNode(head.val);
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = null;
        while (fast!=null&&fast.next!=null){
            //要在slow向后走之前先赋给pre,pre的作用是分割链表，所以pre.next为中间节点，
            pre = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        //分割链表
        pre.next = null;
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }
}
