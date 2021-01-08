package Leetcode;

/*
@author lushuai
@date  2021/1/8-16:52
*/
public class Leetcode05 {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        String res = "";
        //枚举中心点，字母和间隙都可以作为中心点
        for(int i=0;i<s.length()*2-1;i++){
            int left = i/2;
            int right = left+i%2;
            while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                String tem = s.substring(left,right+1);
                if(tem.length()>res.length()){
                    res = tem;
                }
                left--;
                right++;
            }
        }
        return res;
    }
}
