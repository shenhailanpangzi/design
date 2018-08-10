package com.yanghao.design.desogn.J2EEModel.BusinessDelegatePattern.impl;

import com.yanghao.design.desogn.J2EEModel.BusinessDelegatePattern.BusinessService;

/**
 * @Description：
 * 步骤 2
 * 创建实体服务类。
 * @Author:yanghao
 * @Date：2018/7/24 16:16
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}