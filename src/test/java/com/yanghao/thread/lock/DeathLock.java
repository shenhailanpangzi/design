package com.yanghao.thread.lock;

/**
 * @Description：死锁案例
 * Java中死锁最简单的情况是，一个线程T1持有锁L1并且申请获得锁L2，而另一个线程T2持有锁L2并且申请获得锁L1，
 * 因为默认的锁申请操作都是阻塞的，所以线程T1和T2永远被阻塞了。导致了死锁。这是最容易理解也是最简单的死锁的形式。但是实际环境中的死锁往往比这个复杂的多。
 * 可能会有多个线程形成了一个死锁的环路，比如：线程T1持有锁L1并且申请获得锁L2，而线程T2持有锁L2并且申请获得锁L3，而线程T3持有锁L3并且申请获得锁L1，这样导致了一个锁依赖的环路：T1依赖T2的锁L2，T2依赖T3的锁L3，而T3依赖T1的锁L1。从而导致了死锁。
 *
 *
 * 那么如何避免和解决死锁问题呢？
 * 1、按顺序加锁
 * 上个例子线程间加锁的顺序各不一致，导致死锁，如果每个线程都按同一个的加锁顺序这样就不会出现死锁。
 * 2、获取锁时限
 * 每个获取锁的时候加上个时限，如果超过某个时间就放弃获取锁之类的。
 * 3、死锁检测
 * 按线程间获取锁的关系检测线程间是否发生死锁，如果发生死锁就执行一定的策略，如终断线程或回滚操作等。
 *
 * @Author:yanghao
 * @Date：2018/8/10 9:32
 */
public class DeathLock {
    public static String obj1 = "obj1";
    public static String obj2 = "obj2";
    public static void main(String[] args){
        /**
         * 这样，线程1"睡觉"睡完，线程2已经获取了lock2的对象锁了，线程1此时尝试获取lock2的对象锁，便被阻塞，此时一个死锁就形成了
         */
        Thread a = new Thread(new Lock1());
        Thread b = new Thread(new Lock2());
        a.start();
        b.start();
    }
}
class Lock1 implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println("Lock1 running");
            while(true){
                synchronized(DeathLock.obj1){
                    System.out.println("Lock1 lock obj1");
                    Thread.sleep(3000);//获取obj1后先等一会儿，让Lock2有足够的时间锁住obj2
                    synchronized(DeathLock.obj2){
                        System.out.println("Lock1 lock obj2");
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
class Lock2 implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println("Lock2 running");
            while(true){
                synchronized(DeathLock.obj2){
                    System.out.println("Lock2 lock obj2");
                    Thread.sleep(3000);
                    synchronized(DeathLock.obj1){
                        System.out.println("Lock2 lock obj1");
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
