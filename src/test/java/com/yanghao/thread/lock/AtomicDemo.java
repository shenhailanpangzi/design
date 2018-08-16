package com.yanghao.thread.lock;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description：原子类进行i++操作
 * 原子操作是不可分割的整体，没有其他线程可以进入，可以在没有锁的情况下线程安全
 * 但是，单个方法是原子性的，方法和方法之间的调用不是原子性的，解决这个问题要用同步
 * @Author:yanghao
 * @Date：2018/8/15 9:28
 */
public class AtomicDemo {

    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        MyThreadAtom[] myThreadAtoms = new MyThreadAtom[5];
        for (int i = 0; i < myThreadAtoms.length; i++) {
            myThreadAtoms[i] = new MyThreadAtom(myService);
        }
        for (int i = 0; i < myThreadAtoms.length; i++) {
            myThreadAtoms[i].start();
        }
        Thread.sleep(1000);
        System.out.println(myService.atomicLong.get());


    }
    public static class MyService{
        public AtomicLong atomicLong= new AtomicLong();

        public void addNum() {
            System.out.println("Thread:"+Thread.currentThread().getName()+"~~加100的值是："+atomicLong.addAndGet(100));
//            atomicLong.addAndGet(1);
        }
    }
    static class MyThreadAtom extends Thread{
        private MyService myService;

        public MyThreadAtom(MyService myService) {
            this.myService = myService;
        }
        @Override
        public void run(){
            myService.addNum();
        }
    }
}
