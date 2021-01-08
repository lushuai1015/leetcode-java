package Leetcode;

/*
@author lushuai
@date  2021/1/8-17:35
*/
public class Leetcode19 {
    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        //如果fast为空，说明完整的遍历了一遍链表，删除的是头结点
        if(fast==null) return head.next;

        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
