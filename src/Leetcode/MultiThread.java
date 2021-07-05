package Leetcode;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/*
@author lushuai
@date  2021/3/8-20:01
*/
public class MultiThread {
    public static void main(String[] args) {
        //获取Java线程管理
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        //不需要获得同步的monitor和synchronize信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,false);
        //遍历线程信息，仅打印线程ID和名称
        for(ThreadInfo info: threadInfos){
            System.out.println("["+info.getThreadId()+"]"+info.getThreadName());
        }

    }
}
