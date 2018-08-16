package com.yanghao.thread.lock;

/**
 * @Description：关键字volatile主要作用是使变量在多个线程间可见(强制从公共堆栈中获取变量的值，而不是线程私有数据栈)
 * @Author:yanghao
 * @Date：2018/8/10 17:02
 */
public class VolatileDemo {
    private static boolean isstop = false;

    public static void main(String[] args) throws InterruptedException {
        PrintString printString = new PrintString();
        new Thread(printString).start();
        while (!isstop) {
            System.out.println("~~~我在打印~~~");
        }
        System.out.println("打印结束吧~~~~~~");
    }

    static class PrintString extends Thread {

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isstop = true;
        }
    }

}
