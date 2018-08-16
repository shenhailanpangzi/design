package com.yanghao.thread.providerANDconsumer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description：多个消费者一生产者操作栈
 * 生产者向堆栈list对象中存放数据，消费者从list中取出数据，list最大容量是1，
 * @Author:yanghao
 * @Date：2018/8/15 14:38
 */
public class StackDemo {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Provider provider = new Provider(myStack);
        Consumer consumer1 = new Consumer(myStack);
        Consumer consumer2 = new Consumer(myStack);
        Consumer consumer3 = new Consumer(myStack);
        Consumer consumer4 = new Consumer(myStack);

        ThreadAP threadAP = new ThreadAP(provider);
        ThreadAC threadAC1 = new ThreadAC(consumer1);
        ThreadAC threadAC2 = new ThreadAC(consumer2);
        ThreadAC threadAC3 = new ThreadAC(consumer3);
        ThreadAC threadAC4 = new ThreadAC(consumer4);
        threadAP.start();

        threadAC1.setName("1");
        threadAC2.setName("2");
        threadAC3.setName("3");
        threadAC4.setName("4");
        threadAC1.start();
        threadAC2.start();
        threadAC3.start();
        threadAC4.start();
    }
    public static class MyStack{
        private List list = new ArrayList();
        synchronized public void push(){
            try {
                while (list.size() == 1){
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
