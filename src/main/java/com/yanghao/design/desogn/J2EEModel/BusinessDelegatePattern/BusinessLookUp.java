package com.yanghao.design.desogn.J2EEModel.BusinessDelegatePattern;

import com.yanghao.design.desogn.J2EEModel.BusinessDelegatePattern.impl.EJBService;
import com.yanghao.design.desogn.J2EEModel.BusinessDelegatePattern.impl.JMSService;

/**
 * @Description：
 * 步骤 3
 * 创建业务查询服务。
 * @Author:yanghao
 * @Date：2018/7/24 16:17
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}