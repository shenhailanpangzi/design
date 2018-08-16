package com.yanghao.thread.BasicsDemo;

import java.util.ArrayList;
import java.util.List;

/**通过调用wait方法使线程进入等待状态，notify操作相当于使其进入就绪状态
 * wait(Long) 等待一定时间内是否有线程对锁进行唤醒，超时则自动唤醒
 * //notify方法调用后不会立即释放锁
 * lock.notify(); 唤醒当前锁的线程代码
 * notify();随机唤醒 等待状态的线程
 * @Description：
 * @Author:yanghao
 * @Date：2018/8/15 10:01
 */
public class Threadwait {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA threadA = new ThreadA(lock);
            threadA.start();
            Thread.sleep(10);
            ThreadB threadB = new ThreadB(lock);
            threadB.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class MyList{
        private static List list = new ArrayList();

        public static void setList() {
            list.add("yanghao");
        }
        public static int size(){
            return list.size();
        }
    }

    public static class ThreadA extends Thread{
        private Object lock;
        public ThreadA(Object lock) {
            super();
            this.lock = lock;
        }
        @Override
        public void run(){
            try {
                synchronized (lock){
                    if (MyList.size()!=5){
                        System.out.println("wait begin.."+System.currentTimeMillis());
                        lock.wait();
                        System.out.println("wait end.."+System.currentTimeMillis());
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static class ThreadB extends Thread{
        private Object lock;
        public ThreadB(Object lock) {
            super();
            this.lock = lock;
        }
        @Override
        public void run(){
            try {
                synchronized (lock){
                    for (int i = 0; i < 10; i++) {
                        MyList.setList();
                        if (MyList.size()==5){
                            lock.notify();//notify方法调用后不会立即释放锁
                            System.out.println("已发出唤醒通知！！");
                        }
                        System.out.println("添加了"+(i+1)+"个元素！");
                        Thread.sleep(1000);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
