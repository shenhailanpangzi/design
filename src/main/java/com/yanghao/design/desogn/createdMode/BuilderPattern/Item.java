package com.yanghao.design.desogn.createdMode.BuilderPattern;

/**
 * @Description：
 * 步骤 1
 * 创建一个表示食物条目和食物包装的接口。
 * @Author:yanghao
 * @Date：2018/7/23 10:45
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}