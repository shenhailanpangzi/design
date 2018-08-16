package com.yanghao.thread.BasicsDemo;

/**
 * @Description：线程暂停suspend和resume
 * 被放弃使用的原因：
 * 1、公共对象独占，其他线程无法访问
 * 2、因为数据暂停导致不同步
 * @Author:yanghao
 * @Date：2018/8/13 14:43
 */
public class SuspendTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread11 myThread11 = new MyThread11();
        myThread11.start();
        Thread.sleep(1000);
        //A段
        myThread11.suspend();
        System.out.println("A="+System.currentTimeMillis()+"i="+myThread11.getI());
        Thread.sleep(3000);
        System.out.println("A="+System.currentTimeMillis()+"i="+myThread11.getI());
        //B段
        myThread11.resume();
        myThread11.interrupt();//中断线程
        Thread.sleep(3000);
        //C段
        myThread11.suspend();
        System.out.println("B="+System.currentTimeMillis()+"i="+myThread11.getI());
        Thread.sleep(3000);
        System.out.println("B="+System.currentTimeMillis()+"i="+myThread11.getI());

        System.out.println("线程名称："+myThread11.getName()+
                "活跃状态："+myThread11.isAlive()+"线程是否中断："+myThread11.interrupted());
        System.out.println("线程名称："+myThread11.getName()+
        "活跃状态："+myThread11.isAlive()+"线程是否中断："+myThread11.interrupted());
    }

}
class MyThread11 extends Thread{
    private long i = 0;

    public long getI() {
        return i;
    }
    @Override
    public void run(){
        while (true){
            i++;
            if (this.interrupted()){
                System.out.println("线程终止了~");
                break;
            }
        }
    }
}
