package com.yanghao.design.createdMode.SingletonPattern;

/**
 * @Description：步骤 1
 * 创建一个 Singleton 类。 懒汉式
 * @Author:yanghao
 * @Date：2018/7/23 10:15
 */
public class SingleObject {

    //创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}