package com.yanghao.javaBasics;

/**
 * @Description：
 * Java中子类转换成父类是没有任何问题的，那父类可以转换成子类吗？
 * 所以，想让父类强制转换成子类，不是没有可能，除非父类是子类构造出来的实例，不然是不能强转的。
 * @Author:yanghao
 * @Date：2018/8/2 9:22
 */
public class Test1 {
    public static void main(String[] args) {
        test1();
        test2();
    }
    //父转子 转换异常
    private static void test1(){
        Fruit fruit = new Fruit();
        Apple apple =new Apple();
        apple = (Apple)fruit;
    }
    //子转父 成功
    private static void test2(){
        Fruit fruit = new Fruit();
        Apple apple =new Apple();
        fruit = (Apple)apple;
    }
    static class Fruit{
    }
    static class Apple extends Fruit{
    }
}
