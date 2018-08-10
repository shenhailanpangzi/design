package com.yanghao.design.desogn.behavioralModel.CommandPattern;

/**
 * @Description：股票
 * 步骤 2
 * 创建一个请求类。
 * @Author:yanghao
 * @Date：2018/7/24 8:52
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10; //数量

    public void buy(){
        System.out.println("Stock [ Name: "+name+","+
                "Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+","+
                "Quantity: " + quantity +" ] sold");
    }
}