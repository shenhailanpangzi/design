package com.yanghao.design.behavioralModel.CommandPattern;

import com.yanghao.design.behavioralModel.CommandPattern.impl.BuyStock;
import com.yanghao.design.behavioralModel.CommandPattern.impl.SellStock;

/**
 * @Description：
 * 步骤 5
 * 使用 Broker 类来接受并执行命令。
 * @Author:yanghao
 * @Date：2018/7/24 8:54
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

//        将买股票，卖股票请求放入一个接口中，通过placeOrders方法一起执行
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}