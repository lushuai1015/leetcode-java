package Leetcode;

/*
@author lushuai
@date  2021/1/8-15:22
*/
public class Leetcode02 {
    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //初始化一个节点值为0的空节点，正规的写法
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int l1Val = l1!=null ? l1.val : 0;
            int l2Val = l2!=null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            carry = sumVal / 10;

            ListNode sumNode = new ListNode(sumVal % 10);
            //第一步的时候等价于 root.next=sumNode
            cursor.next = sumNode;
            cursor = cursor.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        //这里为什么返回root.next，因为链表的第一个节点定义了一个val为0的哑结点
        return root.next;
    }
}
