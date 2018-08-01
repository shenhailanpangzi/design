package com.yanghao.design.J2EEModel.BusinessDelegatePattern.impl;

import com.yanghao.design.J2EEModel.BusinessDelegatePattern.BusinessService;

/**
 * @Description：
 * 步骤 2
 * 创建实体服务类。
 * @Author:yanghao
 * @Date：2018/7/24 16:17
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}