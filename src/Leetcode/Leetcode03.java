package Leetcode;

import java.util.HashSet;
import java.util.Set;

/*
@author lushuai
@date  2021/1/8-15:26
*/
public class Leetcode03 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    /*
        无重复字符的最长子串
     */
    public static int lengthOfLongestSubstring(String s) {
        int i = 0,j = 0,res = 0;
        Set<Character> set = new HashSet<>();
        while (j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                res = Math.max(res,set.size());
            }else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return res;
    }
}
