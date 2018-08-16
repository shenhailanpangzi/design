package com.yanghao.thread.bankdemo;

/**
 * @Description：脏读例子 读取实例变量的时候，此值已经被其他线程更改了
 *
 * @Author:yanghao
 * @Date：2018/8/13 16:38
 */
public class DityReadDemo {
    public static void main(String[] args) throws InterruptedException {
        PublicVar publicVar = new PublicVar();
        ThreadA threadA = new ThreadA(publicVar);
        threadA.start();
        Thread.sleep(100);
        publicVar.getValue();

    }
    public static class PublicVar{
        public String userName = "AA";
        public String passWord = "AAA";

        public synchronized void setValue(String userName,String passWord){
            try {
                this.userName = userName;
                Thread.sleep(5000);
                this.passWord = passWord;
                System.out.println("setValue的ThreaName:"+Thread.currentThread().getName()
                        +"~~username:"+userName+"~~password:"+passWord);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        public void getValue() {
            System.out.println("getValue的ThreaName:"+Thread.currentThread().getName()
                    +"~~userName:"+userName+"~~PassWord:"+passWord);
        }
    }
    public static class ThreadA extends Thread{
        private PublicVar publicVar;

        public ThreadA(PublicVar publicVar) {
            super();
            this.publicVar = publicVar;
        }
        @Override
        public void run(){
            super.run();
            publicVar.setValue("BB","BBB");
        }
    }
}

