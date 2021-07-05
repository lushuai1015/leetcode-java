package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
@author lushuai
@date  2021/4/17-15:02
*/
public class Leetcode179 {
    public static void main(String[] args) {
        int n = 345;
        String str = String.valueOf(n);
        char[] chars = str.toCharArray();
        System.out.println(chars[0]);
    }

    //重写一种排序方法
    public static String largestNumber(int[] nums) {
        int n = nums.length;
        String[] ss = new String[n];
        for (int i = 0; i < n; i++) ss[i] = "" + nums[i];
        Arrays.sort(ss, (a, b) -> {
            String sa = a + b, sb = b + a ;
            return sb.compareTo(sa);
        });

        StringBuilder sb = new StringBuilder();
        for (String s : ss) sb.append(s);
        int len = sb.length();
        int k = 0;
        while (k < len - 1 && sb.charAt(k) == '0') k++;
        return sb.substring(k);
    }
}
