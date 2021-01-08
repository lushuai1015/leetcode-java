package Leetcode;

/*
@author lushuai
@date  2021/1/8-17:01
*/
public class Leetcode09 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
       String s = String.valueOf(x);
       for(int i=0;i<s.length()/2;i++){
           if(s.charAt(i)!=s.charAt(s.length()-i-1)){
               return false;
           }
       }
       return true;
    }
}
