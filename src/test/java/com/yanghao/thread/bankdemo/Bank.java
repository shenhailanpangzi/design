package com.yanghao.thread.bankdemo;

/**
 * @Description：
 * synchronized代，码块 ：同步代码块作用范围是整个代码块，作用对象是调用这个代码块的对象。
 * synchronized方法 ：同步方法，作用范围是整个方法，作用对象是调用这个方法的对象。
 * synchronized静态方法 ：同步静态方法，作用范围是整个静态方法，作用对象是调用这个类的所有对象。
 * synchronized(this)：作用范围是该对象中所有被synchronized标记的变量、方法或代码块，作用对象是对象本身。
 * synchronized(ClassName.class) ：与synchronized(this)类似，用于静态方法中。
 * @Author:yanghao
 * @Date：2018/8/1 11:27
 */
public class Bank {

    private int count =0;//账户余额

    //存钱
    public synchronized void addMoney(int money){
        count +=money;
        System.out.println(System.currentTimeMillis()+"存进："+money);
    }

    //取钱  注：同步是一种高开销的操作，因此应该尽量减少同步的内容。通常没有必要同步整个方法，使用synchronized代码块同步关键代码即可。
        public void subMoney(int money){
            if(count-money < 0){
                System.out.println("余额不足");
                return;
            }
            count -=money;

        System.out.println(+System.currentTimeMillis()+"取出："+money);
    }

    //查询
    public void lookMoney(){
        System.out.println("账户余额："+count);
    }
}
