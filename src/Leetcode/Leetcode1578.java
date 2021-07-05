package Leetcode;

/*
@author lushuai
@date  2021/5/12-11:39
*/
public class Leetcode1578 {
    public static void main(String[] args) {

    }

    public static int minCost(String s, int[] cost) {
        int res = 0;
        int i = 0;
        int j = 1;
        while (j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                if(cost[i]<cost[j]){
                    res += cost[i];
                    i = j++;
                }else {
                    res += cost[j++];
                }
            }else {
               i = j++;
            }
        }
        return res;
    }
}
