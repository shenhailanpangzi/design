package com.yanghao.thread.providerANDconsumer;

/**
 * @Description：一个生产者一个消费者
 * @Author:yanghao
 * @Date：2018/8/15 11:21
 */
public class OneProConDemo {

    public static void main(String[] args) {
        String lock = new String("");
        Provider provider = new Provider(lock);
        Consumer consumer = new Consumer(lock);
        ThreadAP threadAP = new ThreadAP(provider);
        ThreadAC threadAC = new ThreadAC(consumer);
        System.out.println("Strat。。。。。。。。。");
        threadAP.start();
        threadAC.start();
    }

    public static class ValueObject{
        public static String value="";
    }
    public static class Provider{
        private String lock;

        public Provider(String lock) {
            super();
            this.lock = lock;
        }

        public void setValue() {
            try {
                synchronized (lock){
                    Thread.sleep(1000);
                    if (!ValueObject.value.equals("")){
                        lock.wait();
                    }
                    String value = System.currentTimeMillis()+"_"+System.nanoTime();
                    System.out.println("Set的值是："+value);
                    ValueObject.value = value;
                    lock.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static class Consumer{
        private String lock;

        public Consumer(String lock) {
            super();
            this.lock = lock;
        }

        public void getValue() {
            try {
                synchronized (lock){
                    Thread.sleep(1000);
                    if (ValueObject.value.equals("")){
                        lock.wait();
                    }
                    System.out.println("Get的值是："+ValueObject.value);
                    ValueObject.value = "";
                    lock.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static class ThreadAP extends Thread{
        private Provider provider;

        public ThreadAP(Provider provider) {
            super();
            this.provider = provider;
        }

        @Override
        public void run(){
            while (true){
                provider.setValue();
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
                consumer.getValue();
            }
        }
    }
}
