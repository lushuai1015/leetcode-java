package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
@author lushuai
@date  2021/1/20-14:48
*/
public class Leetcode409 {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
    /*
        给一个字符串，从中任意选择字符，能组成的最长回文字符串

     */
    public static int longestPalindrome(String s) {
        if(s==null||s.length()==0) return 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
        int maxLen = 0;
        boolean hasOdd = false;
        for(Map.Entry<Character,Integer> entry:entrySet){
            int value = entry.getValue();
            if(value%2==0){
                maxLen = maxLen+value;
            } else {
                hasOdd = true;
                value = value-1;
                if(value>0){
                    maxLen = maxLen+value;
                }
            }
        }
        if(hasOdd){
            maxLen++;
        }
        return maxLen;
    }
}
