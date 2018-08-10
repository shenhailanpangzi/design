package com.yanghao.design.desogn.createdMode.BuilderPattern.itemImpl;

import com.yanghao.design.desogn.createdMode.BuilderPattern.Item;
import com.yanghao.design.desogn.createdMode.BuilderPattern.Packing;
import com.yanghao.design.desogn.createdMode.BuilderPattern.packingImpl.Bottle;

/**
 * @Description：
 *  * 步骤 3
 *  * 创建实现 Item 接口的抽象类，该类提供了默认的功能。
 * @Author:yanghao
 * @Date：2018/7/23 10:52
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}