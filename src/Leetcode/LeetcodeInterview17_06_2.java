package Leetcode;

/*
@author lushuai
@date  2021/4/27-14:24
*/
public class LeetcodeInterview17_06_2 {
    public static void main(String[] args) {
        System.out.println(numberOf2sInRange(25));
    }

    public static int numberOf2sInRange(int n) {
        if(n<2) return 0;
        if(n<12) return 1;
        if(n<20) return 2;
        String str = String.valueOf(n);
        //数字的最高位
        int first = Integer.valueOf(str.substring(0,1));
        //数字最高位之后的
        int last = Integer.valueOf(str.substring(1));
        //两位数为10，三位数为100
        int power = (int)Math.pow(10,str.length()-1);
        if(first==1){
            return numberOf2sInRange(power-1)+numberOf2sInRange(last);
        }else if(first==2){
            return numberOf2sInRange(2*power-1)+numberOf2sInRange(last)+last+1;
        }else {
            return power+first*numberOf2sInRange(power-1)+numberOf2sInRange(last);
        }
    }
}
