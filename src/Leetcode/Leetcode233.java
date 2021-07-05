package Leetcode;

/*
@author lushuai
@date  2021/4/28-15:03
*/
public class Leetcode233 {
    public static void main(String[] args) {
        System.out.println(countDigitOne(13));
    }

    public static int countDigitOne(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n<10) return 1;
        if(n==10) return 2;
        String str = String.valueOf(n);
        int first = Integer.valueOf(str.substring(0,1));
        int last = Integer.valueOf(str.substring(1));
        int power = (int)Math.pow(10,str.length()-1);
        if(first==1){
            return countDigitOne(power-1)+countDigitOne(last)+last+1;
        }else {
            return power+countDigitOne(power-1)*first+countDigitOne(last);
        }

    }
}
