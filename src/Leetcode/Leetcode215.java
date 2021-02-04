package Leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
@author lushuai
@date  2021/2/1-18:49
*/
public class Leetcode215 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,2));
    }
    /*
        数组中的第k个最大元素，注意是你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素
        最大堆，然后按顺序出堆到第k个
     */
    public static int findKthLargest(int[] nums, int k) {
        //初始化一个最大堆
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((o1, o2) -> o2-o1);
        for(int i:nums){
            maxheap.add(i);
        }
        for(int i=1;i<k;i++){
            maxheap.poll();
        }
        return maxheap.peek();
    }
}
