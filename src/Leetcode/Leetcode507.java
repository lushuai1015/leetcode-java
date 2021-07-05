package Leetcode;

import java.util.ArrayList;
import java.util.List;

/*
@author lushuai
@date  2021/3/10-14:49
*/
public class Leetcode507 {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }

    public static boolean checkPerfectNumber(int num) {
       if(num==1) return false;
       int sum = 1;
       for(int i=2;i<Math.sqrt(num);i++){
           if(num%i==0){
               sum += i;
               sum += num/i;
           }
       }
       return sum==num;
    }
}
