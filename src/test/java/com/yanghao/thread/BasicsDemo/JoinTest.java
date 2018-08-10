package com.yanghao.thread.BasicsDemo;

/**
 * @Description：  线程合并是优先执行调用该方法的线程，再执行当前线程，来看一个小例子
 * t1和t2都执行完才继续主线程的执行，所谓合并，就是等待其它线程执行完，再执行当前线程，
 * 执行起来的效果就好像把其它线程合并到当前线程执行一样。
 * @Author:yanghao
 * @Date：2018/8/1 17:31
 */
public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        JoinThread t1 = new JoinThread("t1");
        JoinThread t2 = new JoinThread("t2");
        t1.start();
        t2.start();
        t1.join();//优先执行t1
        System.out.println("主线程开始执行！");
    }
}

class JoinThread extends Thread {
    public JoinThread(String name) {
        super(name);
    }
    public void run() {
        for(int i = 1; i <= 10; i++)
            System.out.println(getName() +"id："+ getId() + "执行了" + i + "次");
    }
}