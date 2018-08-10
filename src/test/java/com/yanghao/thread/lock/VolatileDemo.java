package com.yanghao.thread.lock;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/8/10 17:02
 */
public class VolatileDemo {

    public static void main(String[] args) throws InterruptedException {
        PrintString printString = new PrintString();
        new Thread(printString).start();
        System.out.println("打印结束吧~~~~~~");
        Thread.sleep(2000);
        printString.setContinuePrint(false);
    }

    static class PrintString implements Runnable{

        private boolean isContinuePrint = true;

        public void setContinuePrint(boolean continuePrint) {
            isContinuePrint = continuePrint;
        }
        public void print(){
            try {
                while (isContinuePrint == true){
                    System.out.println("打印线程名=="+Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        @Override
        public void run() {
            print();
        }
    }
}
