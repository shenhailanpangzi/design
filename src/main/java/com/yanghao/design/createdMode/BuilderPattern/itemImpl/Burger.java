package com.yanghao.design.createdMode.BuilderPattern.itemImpl;

import com.yanghao.design.createdMode.BuilderPattern.Item;
import com.yanghao.design.createdMode.BuilderPattern.Packing;
import com.yanghao.design.createdMode.BuilderPattern.packingImpl.Wrapper;

/**
 * @Description：汉堡包
 * 步骤 3
 * 创建实现 Item 接口的抽象类，该类提供了默认的功能。
 * @Author:yanghao
 * @Date：2018/7/23 10:50
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}