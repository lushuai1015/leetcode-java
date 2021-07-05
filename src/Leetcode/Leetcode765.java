package Leetcode;

/*
@author lushuai
@date  2021/2/14-11:45
*/
public class Leetcode765 {
    public static void main(String[] args) {

    }
    /*
       贪心算法：
     */
    public static int minSwapsCouples(int[] row) {
        int count = 0;
        for(int i=0;i<row.length;i++){
            int x = row[i];
            if(row[i+1]==(x^1)){
                continue;
            }

            for(int j=i+1;j<row.length;j++){
                if(row[j]==(x^1)){
                    count++;
                    int tmp = row[j];
                    row[j] = row[i+1];
                    row[i+1] = x;
                    break;
                }
            }
        }
        return count;

    }
}
