package Leetcode;

import java.util.ArrayList;
import java.util.List;

/*
@author lushuai
@date  2021/2/7-14:23
*/
public class Leetcode1002 {
    public static void main(String[] args) {
        String[] strings = {"bella","label","roller"};
        System.out.println(commonChars(strings));

    }

    /*
        1.先遍历第一个字符串，获得每个字符的出现次数
        2.遍历第i个字符串
        3.维持数组中次数的最小值
        4.遍历最小的数组
     */
    public static List<String> commonChars(String[] A) {
        //先得到第一个字符串中每个字符的情况
        int[] count0 = new int[26];
        for(int i=0;i<A[0].length();i++){
            count0[A[0].charAt(i)-'a']++;
        }
        for(int i=1;i<A.length;i++){
            int[] countI = new int[26];
            //得到第i个字符串中每个字符的情况
            for(int j=0;j<A[i].length();j++){
                countI[A[i].charAt(j)-'a']++;
            }
            //把得到的数组与count0比较
            for(int k=0;k<26;k++){
                count0[k] = Math.min(count0[k],countI[k]);
            }
        }
        List<String> res = new ArrayList<>();
        for(int i=0;i<26;i++){
            while (count0[i]!=0){
                res.add(String.valueOf((char) (i+'a')));
                count0[i]--;
            }
        }
        return res;

    }
}
