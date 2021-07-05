package Leetcode;

/*
@author lushuai
@date  2021/3/14-20:03
*/
public class Leetcode709 {
    public static void main(String[] args) {
        System.out.println(toLowerCase1("LOVELY"));
    }

    public static String toLowerCase1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                sb.append(Character.toLowerCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

}

