package Leetcode;

import java.util.ArrayList;
import java.util.List;

/*
@author lushuai
@date  2021/5/6-16:57
*/
public class Leetcode1492 {
    public static void main(String[] args) {
        System.out.println(kthFactor(12,3));
    }

    public static int kthFactor(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        if(list.size()>=k){
            return list.get(k-1);
        }
        return -1;
    }
}
