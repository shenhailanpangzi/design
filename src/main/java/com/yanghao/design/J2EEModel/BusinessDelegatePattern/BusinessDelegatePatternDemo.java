package com.yanghao.design.J2EEModel.BusinessDelegatePattern;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 16:18
 */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}