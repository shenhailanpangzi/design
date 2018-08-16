package com.yanghao.thread.lock;

import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Description：
 * 读写锁(ReadWriteLock)，我们会有一种需求，在对数据进行读写的时候，为了保证数据的一致性和完整性，需要读和写是互斥的，写和写是互斥的，
 * 但是读和读是不需要互斥的，这样读和读不互斥性能更高些，来看一下不考虑互斥情况的代码原型：
 * @Author:yanghao
 * @Date：2018/7/31 10:41
 */
public class LockDemo {
    public static void main(String[] args) {
        final Data2 data = new Data2();
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 5; j++) {
                        data.set(new Random().nextInt(30));
                    }
                }
            }).start();
        }
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 5; j++) {
                        data.get();
                    }
                }
            }).start();
        }
    }


    static class Data {
        private int data;// 共享数据
        /**
         *同步：synchronized取得的锁都是对象锁，一个对象一把锁，哪个线程先执行synchronized代码就持有当前对象锁
         *异步：但是，即使该线程持有该对象锁，其他线程依然可以访问没有被synchronized修饰的方法
         * A线程先持有对象object对象的lock，B线程可以以异步的方式调用没有被synchronized修饰的方法，也就是异步
         * A线程先持有对象object对象的lock，B线程调用被synchronized修饰的方法则需要等待 也就是同步
         */
        public synchronized void set(int data) {
            System.out.println(Thread.currentThread().getName() + "准备写入数据");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.data = data;
            System.out.println(Thread.currentThread().getName() + "写入" + this.data);
        }

        public synchronized void get() {
            System.out.println(Thread.currentThread().getName() + "准备读取数据");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "读取" + this.data);
        }

    }
//    用读写锁实现代码
static class Data2 {
        private int data;// 共享数据.
    /**
     * ReadWriteLock是什么?
     * 首先明确一下，不是说ReentrantLock不好，只是ReentrantLock某些时候有局限。如果使用ReentrantLock，
     * 可能本身是为了防止线程A在写数据、线程B在读数据造成的数据不一致，但这样，如果线程C在读数据、
     * 线程D也在读数据，读数据是不会改变数据的，没有必要加锁，但是还是加锁了，降低了程序的性能。
     *
     * 因为这个，才诞生了读写锁ReadWriteLock。ReadWriteLock是一个读写锁接口，ReentrantReadWriteLock
     * 是ReadWriteLock接口的一个具体实现，实现了读写的分离，读锁是共享的，写锁是独占的，读和读之间不会互斥，
     * 读和写、写和读、写和写之间才会互斥，提升了读写的性能。
     */
    private ReadWriteLock rwl = new ReentrantReadWriteLock();
        public void set(int data) {
            rwl.writeLock().lock();// 取到写锁
            try {
                System.out.println(Thread.currentThread().getName() + "准备写入数据");
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.data = data;
                System.out.println(Thread.currentThread().getName() + "写入" + this.data);
            } finally {
                rwl.writeLock().unlock();// 释放写锁
            }
        }
        public void get() {
            rwl.readLock().lock();// 取到读锁
            try {
                System.out.println(Thread.currentThread().getName() + "准备读取数据");
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "读取" + this.data);
            } finally {
                rwl.readLock().unlock();// 释放读锁
            }
        }
    }
}
