package Leetcode;

import java.util.Stack;

/*
@author lushuai
@date  2021/3/10-10:48
*/
public class Leetcode224 {
    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        System.out.println(calculate(s));
    }

    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int len = s.length();
        int sign = 1;   //表示正负，1表示加，0表示减
        int res = 0;
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int cur = ch-'0';
                //while循环能得出两位数及以上的数字
                while (i+1<len&&Character.isDigit(s.charAt(i+1))){
                    cur = cur*10+s.charAt(i+1)-'0';
                }
                res = res+sign*cur;
            }else if(ch=='+'){
                sign = 1;
            }else if(ch=='-'){
                sign = -1;
            }else if(ch=='('){
                //(表示重新开始，res和sign入栈并且重置
                stack.push(res);
                res = 0;
                stack.push(sign);
                sign = 1;
            }else if(ch==')'){
                //遇到)出栈，sign先出栈，然后之前存的数字出栈
                res = stack.pop()*res+stack.pop();
            }
        }
        return res;
    }
}
