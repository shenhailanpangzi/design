package com.yanghao.thread.eggdemo;

/**
 * @Description：为什么使用wait()方法时，一般是需要while循环而不是if？
 * while会一直执行循环，直到条件满足，执行条件才会继续往下执行。if只会执行一次判断条件，不满足就会等待。这样就会出现问题。
 * 我们知道用notify() 和notifyAll()可以唤醒线程，一般我们常用的是notifyAll()，因为notify()，只会随机唤醒一个睡眠线程，并不一定是我们想要唤醒的线程。如果使用的是notifyAll()，唤醒所有的线程，那你怎么知道他想唤醒的是某个正在等待的wait()线程呢，如果用while()方法，就会再次判断条件是不是成立，满足执行条件了，就会接着执行，而if会直接唤醒wait()方法，继续往下执行，根本不管这个notifyAll()是不是想唤醒的是自己还是别人，可能此时if的条件根本没成立。
 * 举个例子：
 * while去水果店买苹果，没有了，然后while就和水果店老板说，有水果的时候通知我，我先回去了。if也去水果店买苹果，没有了，然后if就和水果店老板说，有水果的时候通知我，我先回去了。过一段时间，水果店老板发短信告诉while和if，有水果了，while去一看，水果店只是进了香蕉，并不是苹果，所以不是想要的水果，于是回去继续等水果店老板通知，而if根本就不看是不是自己想要的苹果，直接就叫老板送10斤水果过来，这样会导致你得到错误的结果。
 * @Author:yanghao
 * @Date：2018/8/1 16:19
 */

import java.util.ArrayList;
import java.util.List;

/** 定义一个盘子类，可以放鸡蛋和取鸡蛋 */
public class Plate {
    /** 装鸡蛋的盘子 */
    List<Object> eggs = new ArrayList<Object>();
    /** 取鸡蛋 */
    public synchronized Object getEgg() {
//  在调用wait方法时，都是用while判断条件的，而不是if，在wait方法说明中，也推荐使用while，因为在某些特定的情况下，线程有可能被假唤醒，使用while会循环检测更稳妥。wait和notify方法必须工作于synchronized内部，且这两个方法只能由锁对象来调用。
        while (eggs.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Object egg = eggs.get(0);
        eggs.clear();// 清空盘子
        notifyAll();// 唤醒阻塞队列的所有线程到就绪队列
        System.out.println("拿到鸡蛋");
        return egg;
    }
    /** 放鸡蛋 */
    public synchronized void putEgg(Object egg) {
        while (eggs.size() > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        eggs.add(egg);// 往盘子里放鸡蛋
        notifyAll();// 唤醒阻塞队列的所有线程到就绪队列
    }

    static class AddThread implements Runnable  {
        private Plate plate;
        private Object egg = new Object();
        public AddThread(Plate plate) {
            this.plate = plate;
        }
        public void run() {
            plate.putEgg(egg);
        }
    }
    static class GetThread implements Runnable  {
        private Plate plate;
        public GetThread(Plate plate) {
            this.plate = plate;
        }
        public void run() {
            plate.getEgg();
        }
    }
    public static void main(String args[]) {
        Plate plate = new Plate();

        for(int i = 0; i < 100; i++) {
            new Thread(new AddThread(plate)).start();
            new Thread(new GetThread(plate)).start();
        }
    }
}