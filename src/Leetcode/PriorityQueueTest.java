package Leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
@author lushuai
@date  2021/5/5-16:28
*/
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(5);
        minHeap.add(4);
        minHeap.add(3);
        minHeap.add(6);
        System.out.println(minHeap.peek());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(10, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        maxHeap.add(3);
        maxHeap.add(4);
        maxHeap.add(5);
        maxHeap.add(6);
        System.out.println(maxHeap.peek());


    }
}
