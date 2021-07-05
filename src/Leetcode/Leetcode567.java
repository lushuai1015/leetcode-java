package Leetcode;

import java.util.Arrays;

/*
@author lushuai
@date  2021/2/10-15:55
*/
public class Leetcode567 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));

    }

    /*
    滑动窗口：由于排列不会改变字符串中每个字符的个数，
    所以只有当两个字符串每个字符的个数均相等时，
    一个字符串才是另一个字符串的排列
     */
    public static boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1>len2){
            return false;
        }
        //因为只包含小写字母，用一个长度为26的数组记录字符串中的字符出现次数
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i=0;i<len1;i++){
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        for(int i=len1;i<len2;i++){
            arr2[s2.charAt(i)-'a']++;
            arr2[s2.charAt(i-len1)-'a']--;
            if(Arrays.equals(arr1,arr2)){
                return true;
            }
        }
        return false;
    }

}
