package Leetcode;

import java.util.*;

/*
@author lushuai
@date  2021/2/1-17:45
*/
public class Leetcode347 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(nums, 2)));
    }
    /*
        前K高频的元素 top K问题
        题目说时间复杂度必须优于O(nlogn),所以普通的排序方法不适用

     */
    public static int[] topKFrequent(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        //Map.Entry是map中的一个接口，可以getKey和getValue
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        //entrySet实现了Set接口，里面存放的是键值对
        maxHeap.addAll(map.entrySet());
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++){
            list.add(maxHeap.poll().getKey());
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
