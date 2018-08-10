package com.yanghao.design.desogn.createdMode.BuilderPattern.packingImpl;

import com.yanghao.design.desogn.createdMode.BuilderPattern.Packing;

/**
 * @Description：
 * 步骤 2
 * 创建实现 Packing 接口的实体类。
 * @Author:yanghao
 * @Date：2018/7/23 10:47
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "包装纸包装！！";
    }
}