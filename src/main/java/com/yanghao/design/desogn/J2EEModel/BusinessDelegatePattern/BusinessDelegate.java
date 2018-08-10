package com.yanghao.design.desogn.J2EEModel.BusinessDelegatePattern;

/**
 * @Description：
 * 步骤 4
 * 创建业务代表。
 * @Author:yanghao
 * @Date：2018/7/24 16:17
 */
public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}