package com.yanghao.thread.providerANDconsumer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description：一个消费者多个生产者操作栈
 * 生产者向堆栈list对象中存放数据，消费者从list中取出数据，list最大容量是1，
 * @Author:yanghao
 * @Date：2018/8/15 14:38
 */
public class StackDemo2 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Provider provider1 = new Provider(myStack);
        Provider provider2 = new Provider(myStack);
        Provider provider3 = new Provider(myStack);
        Provider provider4 = new Provider(myStack);
        Consumer consumer = new Consumer(myStack);
        ThreadAP threadAP1 = new ThreadAP(provider1);
        ThreadAP threadAP2 = new ThreadAP(provider2);
        ThreadAP threadAP3 = new ThreadAP(provider3);
        ThreadAP threadAP4 = new ThreadAP(provider4);
        ThreadAC threadAC1 = new ThreadAC(consumer);
        threadAP1.setName("1");
        threadAP2.setName("2");
        threadAP3.setName("3");
        threadAP4.setName("4");
        threadAP1.start();
        threadAP2.start();
        threadAP3.start();
        threadAP4.start();
        threadAC1.start();
    }
    public static class MyStack{
        private List list = new ArrayList();
        synchronized public void push(){
            try {
                while (list.size() == 1){
                    System.out.println("push操作中的"+Thread.currentThread().getName()+"线程呈现wait状态");
                    this.wait();
                }
                String a="anySting=="+Math.random();
                list.add(a);
                System.out.println("Push=="+a);
                this.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized public void pop(){
            String returnValue = "";
            try {
                while (list.size() == 0){
                    System.out.println("pop操作中的"+Thread.currentThread().getName()+"线程呈现wait状态");
                    this.wait();
                }
                returnValue =""+list.get(0);
                list.remove(0);
                this.notifyAll();
                System.out.println("Pop=="+Thread.currentThread().getName()+"消费了："+returnValue);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 生产者和消费者线程
     */
    public static class ThreadAP extends Thread{
        private Provider provider;

        public ThreadAP(Provider provider) {
            super();
            this.provider = provider;
        }

        @Override
        public void run(){
            while (true){
                provider.pushService();
            }
        }
    }
    public static class ThreadAC extends Thread{
        private Consumer consumer;

        public ThreadAC(Consumer consumer) {
            super();
            this.consumer = consumer;
        }
        @Override
        public void run(){
            while (true){
                consumer.PopService();
            }
        }
    }

    /**
     * 生产者和消费者
     */
    public static class Provider{
        private MyStack myStack;

        public Provider(MyStack myStack) {
            this.myStack = myStack;
        }

        public void pushService() {
            myStack.push();
        }
    }
    public static class Consumer{
        private MyStack myStack;

        public Consumer(MyStack myStack) {
            this.myStack = myStack;
        }

        public void PopService() {
            myStack.pop();
        }
    }


}
