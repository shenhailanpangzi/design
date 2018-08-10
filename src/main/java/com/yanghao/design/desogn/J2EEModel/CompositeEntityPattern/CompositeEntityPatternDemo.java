package com.yanghao.design.desogn.J2EEModel.CompositeEntityPattern;

/**
 * @Description：
 * 步骤 5
 * 使用 Client 来演示组合实体设计模式的用法。
 * @Author:yanghao
 * @Date：2018/7/24 16:49
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}