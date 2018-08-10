package com.yanghao.thread.threadPool;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/8/8 15:11
 */
public class FutureANDCallable {
    public static void main(String[] args) {
        Callable<Integer> callable = new Callable<Integer>() {
            public Integer call() throws Exception {
                Thread.sleep(6000);
                Integer a = new Random().nextInt(100);
                System.out.println("已生成随机数"+a);
                return a;
            }
        };
        FutureTask<Integer> future = new FutureTask<Integer>(callable);
        new Thread(future).start();
        try {
            Thread.sleep(5000);// 可能做一些事情
            System.out.println(future.get());//得到结果如果等不到则继续等待
            System.out.println("执行完毕！！！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    /**
     *通过ExecutorService的submit方法执行Callable，并返回Future，代码如下：
     * ExecutorService继承自Executor，它的目的是为我们管理Thread对象，
     *  从而简化并发编程，Executor使我们无需显示的去管理线程的生命周期，是JDK 5之后启动任务的首选方式。
     * @param
     */
    @Test
    public void test1(){
        ExecutorService threadPool = Executors.newSingleThreadExecutor();

        FutureTask futureTask = new FutureTask(new Callable<Integer>() {
            public Integer call() throws Exception {
                return new Random().nextInt(100);
            }
        });
        threadPool.submit(futureTask);

        Future<Integer> future = threadPool.submit(new Callable<Integer>() {
            public Integer call() throws Exception {
                return new Random().nextInt(100);
            }
        });
        try {
            Thread.sleep(5000);// 可能做一些事情
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
