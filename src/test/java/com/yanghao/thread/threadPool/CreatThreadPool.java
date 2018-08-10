package com.yanghao.thread.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/8/8 14:49
 */
public class CreatThreadPool {
    public static void main(String[] args) {

//        1.  创建一个可重用固定线程集合的线程池，以共享的无界队列方式来运行这些线程。
        ExecutorService threadPool_1 = Executors.newFixedThreadPool(3);// 创建可以容纳3个线程的线程池
//        2. 创建一个可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们。
        ExecutorService threadPool_2 = Executors.newCachedThreadPool();// 线程池的大小会根据执行的任务数动态分配
//        3. 创建一个使用单个 worker 线程的 Executor，以无界队列方式来运行该线程。
        ExecutorService threadPool_3 = Executors.newSingleThreadExecutor();// 创建单个线程的线程池，如果当前线程在执行任务时突然中断，则会创建一个新的线程替代它继续执行任务
//        4. 创建一个可安排在给定延迟后运行命令或者定期地执行的线程池。
        ScheduledExecutorService threadPool_4 = Executors.newScheduledThreadPool(3);// 效果类似于Timer定时器

    }
}
