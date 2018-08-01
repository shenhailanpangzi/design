package com.yanghao.design.behavioralModel.CommandPattern.impl;

import com.yanghao.design.behavioralModel.CommandPattern.Order;
import com.yanghao.design.behavioralModel.CommandPattern.Stock;

/**
 * @Description：
 * 步骤 3
 * 创建实现了 Order 接口的实体类。
 * @Author:yanghao
 * @Date：2018/7/24 8:54
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}