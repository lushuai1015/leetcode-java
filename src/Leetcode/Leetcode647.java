package Leetcode;

/*
@author lushuai
@date  2021/2/4-16:43
*/
public class Leetcode647 {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countSubstrings(s));
    }
    /*
    回文子串：中心扩展法
     */
    public static int countSubstrings(String s) {
        int res = 0;
        //枚举中心点
        for(int i=0;i<s.length()*2-1;i++){
            int left = i/2;
            int right = i/2+i%2;
            while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                res++;
                left--;
                right++;
            }
        }
        return res;
    }

    //判断是否为回文串，emm没用上啊，和第五题很像
    private static boolean help(String s){
        int len = s.length();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}
