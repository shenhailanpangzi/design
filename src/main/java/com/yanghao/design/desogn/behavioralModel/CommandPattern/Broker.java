package com.yanghao.design.desogn.behavioralModel.CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description：
 * 步骤 4
 * 创建命令调用类。
 * @Author:yanghao
 * @Date：2018/7/24 8:54
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}