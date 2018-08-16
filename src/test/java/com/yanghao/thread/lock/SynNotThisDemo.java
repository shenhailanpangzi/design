package com.yanghao.thread.lock;

/**
 * @Description：
 *1、  任意对象作为对象监视器(锁非this对象)
 *  优点：如果在一个类中有多个synchronize方法，这时虽然能实现同步，但是会收到阻塞,影响效率
 *  但是如果使用同步代码块锁非this对象，则synchronize（非this）代码块中的程序与同步方法是异步的，不与其他锁this同步方法抢占this锁，提高效率
 * 2、以class为锁(对此类的所有对象实例起作用)
 *
 *3、对象锁只要对象不变，即使对象属性改变，运行结果还是同步的
 * @Author:yanghao
 * @Date：2018/8/14 9:22
 */
public class SynNotThisDemo {
    public static void main(String[] args) {
        Service1 service1 = new Service1();
        ThreadB a = new ThreadB(service1);
        a.setName("a");
        ThreadB b = new ThreadB(service1);
        b.setName("b");
        a.start();
        b.start();
    }

    static class Service1{
        private String username;
        private String password;
        String anyThing = new String();//是同一个对象锁则同步调用，不是则异步调用

        public void setUser(String username,String password) {
            this.username = username;
            try {
                synchronized (anyThing){
                    System.out.println("Thread:"+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"in同步块");
                    this.username=username;
                    Thread.sleep(3000);
                    this.password=password;
                    System.out.println("Thread:"+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"out同步块");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        public synchronized void sout(){
            System.out.println("Thread:"+Thread.currentThread().getName()+"UserName"+username+"~~PassWord:"+password);
        }
    }
    static class ThreadB extends Thread{
        private Service1 service1;
        public ThreadB(Service1 service1) {
            this.service1 = service1;
        }
        @Override
        public void run(){
            service1.sout();
            service1.setUser("AA","a");
        }
    }
}
