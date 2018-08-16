package com.yanghao.thread.BasicsDemo;

/**
 * @Description：线程停止：使用interrupt方法,不能使用stop因为stop是作废方法，线程不安全、会产生不可预料后果
 *  interrupt方法相当于在当前线程打了个停止的标记
 *  经常使用interrupt方法与return
 * @Author:yanghao
 * @Date：2018/8/13 9:55
 */
public class ThreadStop {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Thread() {
            @Override
            public void run() {
                System.out.println("线程执行中。。。。");
                try {
                    //在沉睡中被终止会进入catch语句，并且清除停止状态，置为false
//                    Thread.sleep(1000);
                    //一般情况
                    for (int i = 0; i < 1000000; i++) {
                        if (this.interrupted()){
                            System.err.println("线程已经停止了!!!!我要退出");
                            throw new InterruptedException();
                        }
                        System.out.println("程序执行中~~~~~"+i);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("线程执行完毕。。。。");
            }
        });
        thread1.start();
//        Thread.currentThread().interrupt();
//        thread1.interrupted();//测试当前线程是否已经是中断状态，执行后将状态标志置为false
//        thread1.isInterrupted();//测试线程是否中断状态，执行后不清除状态标志
        thread1.interrupt();//中断线程
        System.out.println("是否停止 1？"+thread1.interrupted());
        System.out.println("是否停止 2？"+thread1.interrupted());


    }
}
