package com.yanghao.design.behavioralModel.NullObjectPattern;

/**
 * @Description：
 * 步骤 2
 * 创建扩展了上述类的实体类。
 * @Author:yanghao
 * @Date：2018/7/24 14:56
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}