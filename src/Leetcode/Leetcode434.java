package Leetcode;

/*
@author lushuai
@date  2021/5/12-11:46
*/
public class Leetcode434 {
    public static void main(String[] args) {

    }
    public static int countSegments(String s) {
        if(s==null||s.length()==0) return 0;
        String[] strings = s.split(" ");
        return strings.length;
    }
}
