package Leetcode;

import java.util.PriorityQueue;

/*
@author lushuai
@date  2021/1/11-19:57
*/
public class LeetcodeInterview17_14 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6,8};
        int[] res = smallestK(arr,4);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
    /*
        找出数组中最小的k个数：优先队列。
        优先队列是最小堆
     */
    public static int[] smallestK(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            minHeap.add(arr[i]);
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = minHeap.poll();
        }
        return res;
    }
}
