package com.yanghao.design.desogn.J2EEModel.BusinessDelegatePattern;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 16:18
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}