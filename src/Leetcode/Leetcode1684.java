package Leetcode;

/*
@author lushuai
@date  2021/7/5-0:01
*/
public class Leetcode1684 {
    public static void main(String[] args) {
        String str = "abc";
        String[] strings = {"a","b","c","ab","ac","bc","abc"};
        System.out.println(help("baaa","ab"));
        System.out.println(countConsistentStrings(str,strings));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        for(int i = 0;i<words.length;i++){
            if(help(words[i],allowed)){
                res++;
            }
        }
        return res;
    }

    private static boolean help(String str,String allowed){
        for(int i=0;i<str.length();i++){
            if(!allowed.contains(Character.toString(str.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
