package Leetcode;

/*
@author lushuai
@date  2021/5/5-16:01
*/
public class Leetcode754 {
    public static void main(String[] args) {

    }

    /*
        等价于数组添加正负号的问题
        就是求最小的i， 使得 i *(i + 1) /2 - target为偶数且大于等于0
     */
    public static int reachNumber(int target) {
        target = Math.abs(target);
        int i = 1;
        while (true){
            int sum = (i+1)*i/2;
            if(sum>=target&&(sum-target)%2==0){
                return i;
            }
            i++;
        }
    }
}
