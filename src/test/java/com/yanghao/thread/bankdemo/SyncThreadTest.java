package com.yanghao.thread.bankdemo;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/8/1 11:27
 */
public class SyncThreadTest {

    public static void main(String args[]) throws InterruptedException {
        final Bank bank= new Bank();
        //存钱
        Thread tadd=new Thread(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                for (int i = 0; i <100000 ; i++) {
                    try {
                        Thread.sleep(0);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    bank.addMoney(1);
//                    bank.lookMoney();
                }
            }
        });
        //取钱
//        Thread tsub = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                // TODO Auto-generated method stub
//                for (int i = 0; i <100 ; i++) {
//                    bank.subMoney(1);
////                    bank.lookMoney();
//                    System.out.println("\n");
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
        new Thread(tadd).start();
        new Thread(tadd).start();
        tadd.start();
//        tsub.start();
        Thread.sleep(7000);
        bank.lookMoney();
    }
}
