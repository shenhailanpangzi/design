package com.yanghao.design.createdMode.BuilderPattern.packingImpl;

import com.yanghao.design.createdMode.BuilderPattern.Packing;

/**
 * @Description：
 *  * 步骤 2
 *  * 创建实现 Packing 接口的实体类。
 * @Author:yanghao
 * @Date：2018/7/23 10:47
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "瓶子包装!!";
    }
}