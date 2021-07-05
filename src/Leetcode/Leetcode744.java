package Leetcode;

import java.util.Arrays;

/*
@author lushuai
@date  2021/5/5-14:37
*/
public class Leetcode744 {
    public static void main(String[] args) {
        char[] letters1 = {'c','f','j'};
        char target1 = 'a';
        char[] letters2 = {'c','f','j'};
        char target2 = 'd';
        char[] letters3 = {'c','b','a'};
        char target3 = 'z';
        System.out.println(nextGreatestLetter(letters1,target1));
        System.out.println(nextGreatestLetter(letters2,target2));
        System.out.println(nextGreatestLetter(letters3,target3));

    }

    public static char nextGreatestLetter(char[] letters, char target) {
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target){
                return letters[i];
            }
        }
        return letters[0];
    }
}
