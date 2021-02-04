package Leetcode;

import java.util.ArrayDeque;
import java.util.Stack;

/*
@author lushuai
@date  2021/1/11-16:38
*/
public class Leetcode20 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
    /*
        有效的括号，使用栈
        注意switch语句中break的用法，在case后面不break的话，会顺序执行完所有语句
     */
    public static boolean isValid(String s) {
        int len = s.length();
        if(len%2==1) return false;
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(int i=0;i<len;i++){
            switch (chars[i]){
                case '(' : stack.push('(');break;
                case '[' : stack.push('[');break;
                case '{' : stack.push('{');break;
                case ')' :
                    if(stack.isEmpty()||stack.pop()!='('){
                        return false;
                    }
                    break;
                case ']' :
                    if(stack.isEmpty()||stack.pop()!='['){
                        return false;
                    }
                    break;
                case '}' :
                    if(stack.isEmpty()||stack.pop()!='{'){
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
