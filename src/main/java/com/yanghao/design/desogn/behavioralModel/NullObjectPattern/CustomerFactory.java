package com.yanghao.design.desogn.behavioralModel.NullObjectPattern;

/**
 * @Description：
 * 步骤 3
 * 创建 CustomerFactory 类。
 * @Author:yanghao
 * @Date：2018/7/24 14:57
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
                        //忽略大小写
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}