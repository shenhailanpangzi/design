package com.yanghao.thread.BasicsDemo;

import org.junit.Test;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/31 14:10
 */
public class ThreadDemo {

    /**
     * 测试.run和.start的区别
     */
    @Test
    public void test1(){
        /**
         * 1）thread1和thread2的线程ID不同，thread2和主线程ID相同，说明通过run方法调用并不会创建新的线程，而是在主线程中直接运行run方法，跟普通的方法调用没有任何区别；
         * 2）虽然thread1的start方法调用在thread2的run方法前面调用，但是先输出的是thread2的run方法调用的相关信息，说明新线程创建的过程不会阻塞主线程的后续执行。
         */
        System.out.println("主线程ID:"+Thread.currentThread().getId());
        MyThread thread1 = new MyThread("thread1");
        thread1.start();
        MyThread thread2 = new MyThread("thread2");
        thread2.run();
    }
    static class MyThread extends Thread{
        private String name;

        public MyThread(String name){
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println("name:"+name+" 子线程ID:"+Thread.currentThread().getId());
        }
    }

    /**
     * sleep相当于让线程睡眠，交出CPU，让CPU去执行其他的任务。
     * 但是有一点要非常注意，sleep方法不会释放锁，也就是说如果当前线程持有对某个对象的锁，则即使调用sleep方法，其他线程也无法访问这个对象。看下面这个例子就清楚了：
     */
    private int i = 10;
    private Object object = new Object();

    public static void main(String[] args) {
        ThreadDemo test = new ThreadDemo();
        MyThread1 thread1 = test.new MyThread1();
        MyThread1 thread2 = test.new MyThread1();
        thread1.start();
        thread2.start();
    }
    class MyThread1 extends Thread{
        @Override
        public void run() {
            synchronized (object) {
                i++;
                System.out.println("i:"+i);
                try {
                    System.out.println("线程"+Thread.currentThread().getName()+"进入睡眠状态");
                    Thread.currentThread().sleep(10000);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                    System.err.println("出错了！！！");
                }
                System.out.println("线程"+Thread.currentThread().getName()+"睡眠结束");
                i++;
                System.out.println("i:"+i);
            }
        }
    }



}
