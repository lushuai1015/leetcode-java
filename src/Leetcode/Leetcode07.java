package Leetcode;

/*
@author lushuai
@date  2021/1/8-16:59
*/
public class Leetcode07 {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    public static int reverse(int x) {
        long res=0;
        while (x!=0)
        {
            res=res*10+x%10;
            if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE)
                return 0;
            x=x/10;
        }
        return (int)res;
    }

}
