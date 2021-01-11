package Leetcode;

/*
@author lushuai
@date  2021/1/11-14:36
*/
public class Leetcode1700 {
    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};
        System.out.println(countStudents(students,sandwiches));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        int stu0 = 0;
        int stu1 = 0;
        //计算吃各种午餐的学生，因为学生是可以循环的，所以有意义的只是学生数量，次序没有意义
        for(Integer i:students){
            if(i==0){
                stu0++;
            }else {
                stu1++;
            }
        }
        for(int i=0;i<sandwiches.length;i++){
            if(sandwiches[i]==0&&stu0==0) return stu1;
            if(sandwiches[i]==1&&stu1==0) return stu0;
            if(sandwiches[i]==0){
                stu0--;
            }else {
                stu1--;
            }
        }
        return 0;
    }
}
