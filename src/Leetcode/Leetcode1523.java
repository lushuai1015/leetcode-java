package Leetcode;

/*
@author lushuai
@date  2021/4/17-14:30
*/
public class Leetcode1523 {
    public static void main(String[] args) {
        System.out.println(countOdds(3,7));
        System.out.println(countOdds(8,10));
    }

    public static int countOdds(int low, int high) {
        if(low>high) return 0;
        if(low==high){
            if(low%2==1){
                return 1;
            }else {
                return 0;
            }
        }
        if (low%2==1&&high%2==1){
            return (high-low)/2+1;
        }
        if(low%2==0&&high%2==0){
            return (high-low)/2;
        }
        if(low%2==1&&high%2==0){
            return (high-low)/2+1;
        }
        return (high-low)/2+1;

    }
}
