package com.yanghao.thread.lock;

/**
 * @Description：
 * 1、synchronize加在方法上 锁对象，同步当前方法，当前对象其他synchronize方法同步，其余异步
 * 2、synchronize锁this  锁当前对象，同步代码块，当前对象其他synchronize方法同步，其余代码异步
 * 3、synchronize锁非this Object对象  锁定Object对象，同步代码块，当前对象Object锁同步，其他synchronize方法异步，其余代码异步
 * 4、synchronize锁class 当前类的所有实例对象加锁，同步代码块，其他synchronize方法同步，其余代码异步
 * @Author:yanghao
 * @Date：2018/8/13 17:20
 */
public class SynchronizeDemo {
    public static void main(String[] args) {
        //    同步代码块(也是锁定当前对象) start................
        ServiceA serviceA = new ServiceA();
        new ThreadA(serviceA).start();
        new ThreadA(serviceA).start();
        //    同步代码块(也是锁定当前对象) end................
    }
//    同步代码块(也是锁定当前对象) start................
    static class ThreadA extends Thread{
        private ServiceA serviceA;
        public ThreadA(ServiceA serviceA) {
            this.serviceA = serviceA;
        }
        @Override
        public void run(){
            serviceA.doThing();
        }
    }
    static class ServiceA{
        public void doThing(){
            for (int i = 0; i < 100; i++) {
                System.out.println("NoSyThread:"+Thread.currentThread().getName()+"      i="+i);
            }
            System.out.println("开始同步~~");
            synchronized (this){
                for (int i = 0; i < 100; i++) {
                    System.out.println("SyThread:"+Thread.currentThread().getName()+"      i="+i);
                }
            }
        }
    }
//    同步代码块(也是锁定当前对象) end................
}
