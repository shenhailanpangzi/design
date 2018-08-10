package com.yanghao.thread.Timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Description：
 * 看一个稍复杂的例子，假设有这样一种需求，实现一个连环炸弹，2秒后爆炸一次，3秒后爆炸一次，
 * 如此循环下去，这就需要创建两个任务，互相调度，代码如下：
 * 自JDK5之后，可以用ScheduledThreadPoolExecutor来替代Timer。
 * @Author:yanghao
 * @Date：2018/8/8 14:41
 */
public class TimerTest {
    static class MyTimerTask1 extends TimerTask {
        @Override
        public void run() {
            System.out.println("爆炸！！！");
            new Timer().schedule(new MyTimerTask2(), 2000);
        }
    }
    static class MyTimerTask2 extends TimerTask {
        @Override
        public void run() {
            System.out.println("爆炸！！！");
            new Timer().schedule(new MyTimerTask1(), 3000);
        }
    }
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new MyTimerTask2(), 2000);
        while(true) {
            System.out.println(new Date().getSeconds());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
