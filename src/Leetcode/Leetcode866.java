package Leetcode;

/*
@author lushuai
@date  2021/4/25-10:11
*/
public class Leetcode866 {
    public static void main(String[] args) {
        System.out.println(primePalindrome(13));
    }
    /*
        大于等于N的最小回文素数
     */
    public static int primePalindrome(int N){
        while (!(isHuiwen(N)&&isSushu(N))){
            N++;
        }
        return N;
    }

    private static boolean isHuiwen(int num){
        String str = Integer.toString(num);
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length/2;i++){
            if(chars[i]!=chars[chars.length-1-i]){
                return false;
            }
        }
        return true;

    }

    private static boolean isSushu(int num){
        if(num==1) return false;
        if(num==2) return true;
        for(int i=2;i<Math.sqrt(num)+1;i++){
            if((num%i)==0){
                return false;
            }
        }
        return true;
    }
}
