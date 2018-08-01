package com.yanghao.design.behavioralModel.NullObjectPattern;

/**
 * @Description：
 * 步骤 2
 * 创建扩展了上述类的实体类。
 * @Author:yanghao
 * @Date：2018/7/24 14:56
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
