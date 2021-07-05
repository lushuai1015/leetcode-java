package Leetcode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
@author lushuai
@date  2021/2/7-11:26
*/
public class Leetcode21 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(3);
        node1.next.next = new ListNode(5);
        ListNode node2 = new ListNode(2);
        node2.next = new ListNode(4);
        node2.next.next = new ListNode(6);
        ListNode node = mergeTwoLists(node1,node2);
        List<Integer> list = new ArrayList<>();
        while (node!=null){
            list.add(node.val);
            node = node.next;
        }

        System.out.println(list);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode mergeHead;
        if(l1.val<l2.val){
            mergeHead = l1;
            mergeHead.next = mergeTwoLists(l1.next,l2);
        }else {
            mergeHead = l2;
            mergeHead.next = mergeTwoLists(l1,l2.next);
        }
        return mergeHead;
    }
}
