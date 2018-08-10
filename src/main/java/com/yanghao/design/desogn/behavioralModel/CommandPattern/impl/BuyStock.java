package com.yanghao.design.desogn.behavioralModel.CommandPattern.impl;

import com.yanghao.design.desogn.behavioralModel.CommandPattern.Order;
import com.yanghao.design.desogn.behavioralModel.CommandPattern.Stock;

/**
 * @Description：
 * 步骤 3
 * 创建实现了 Order 接口的实体类。
 * @Author:yanghao
 * @Date：2018/7/24 8:53
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}