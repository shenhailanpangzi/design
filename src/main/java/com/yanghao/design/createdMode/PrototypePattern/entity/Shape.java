package com.yanghao.design.createdMode.PrototypePattern.entity;

/**
 * @Description：
 * 步骤 1
 * 创建一个实现了 Clonable 接口的抽象类。
 * @Author:yanghao
 * @Date：2018/7/23 11:14
 */

/**
 * clone：它允许在堆中克隆出一块和原对象一样的对象，并将这个对象的地址赋予新的引用。
 * Java 中 一个类要实现clone功能 必须实现 Cloneable接口，否则在调用 clone() 时会报 CloneNotSupportedException 异常。
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
