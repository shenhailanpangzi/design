package com.yanghao.thread.bankdemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/8/1 15:38
 */
public class Bank2 {
    private  int count = 0;// 账户余额

    /**
     *   在JavaSE5.0中新增了一个java.util.concurrent包来支持同步。ReentrantLock类是可重入、互斥、实现了Lock接口的锁， 它与使用synchronized方法和快具有相同的基本行为和语义，并且扩展了其能力。
     *      ReenreantLock类的常用方法有：
     *          ReentrantLock() : 创建一个ReentrantLock实例
     *          lock() : 获得锁
     *          unlock() : 释放锁
     */
    //需要声明这个锁  注：ReentrantLock()还有一个可以创建公平锁的构造方法，但由于能大幅度降低程序运行效率，不推荐使用
    private Lock lock = new ReentrantLock();

    // 存钱
    public void addMoney(int money) {
        lock.lock();//上锁
        try{
            count += money;
            System.out.println(System.currentTimeMillis() + "存进：" + money);

        }finally{
            lock.unlock();//解锁
        }
    }

    // 取钱
    public void subMoney(int money) {
        lock.lock();
        try{

            if (count - money < 0) {
                System.out.println("余额不足");
                return;
            }
            count -= money;
            System.out.println(+System.currentTimeMillis() + "取出：" + money);
        }finally{
            lock.unlock();
        }
    }

    // 查询
    public void lookMoney() {
        System.out.println("账户余额：" + count);
    }

}
