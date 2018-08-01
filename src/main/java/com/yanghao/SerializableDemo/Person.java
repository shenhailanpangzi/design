package com.yanghao.SerializableDemo;

import java.io.Serializable;

/**
 * @Description：序列化demo
 * @Author:yanghao
 * @Date：2018/7/23 13:50
 */
public class Person implements Serializable {
    /**
     * 序列化 ID 在 Eclipse 下提供了两种生成策略
     *
     * 一个是固定的 1L
     * 一个是随机生成一个不重复的 long 类型数据（实际上是使用 JDK 工具，根据类名、接口名、成员方法及属性等来生成）
     * 上面程序中，输出对象和读入对象使用的是同一个Person类。
     *
     * 如果是通过网络传输的话，如果Person类的serialVersionUID不一致，那么反序列化就不能正常进行。
     * 例如在客户端A中Person类的serialVersionUID=1L，而在客户端B中Person类的serialVersionUID=2L
     * 那么就不能重构这个Person对象。
     */
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return "name:"+name+"\tage:"+age;
    }
}
