package com.yanghao.thread.BasicsDemo;

/**
 * @Description：守护线程
 * java中有两种线程，用户线程和守护线程,最经典的守护线程是垃圾回收器（GC）,当用户线程结束时守护线程自动销毁
 * 任何一个守护进程都是JVM中所有非守护线程的保姆，只要任何一个用户线程没有停止，守护线程就在工作，守护线程跟随JVM一同结束工作
 * @Author:yanghao
 * @Date：2018/8/13 15:47
 */
public class deamonTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread112 myThread112 = new MyThread112();
        myThread112.setDaemon(true);
        myThread112.start();
        Thread.sleep(10000);
        System.out.println("我离开myThread112对象就不打印了，也就是停止了");
    }
    //守护线程
    public static class MyThread112 extends Thread{
        private int i = 0;
        @Override
        public  void run(){
            try {
                while (true) {
                    i++;
                    System.out.println("i=="+i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
