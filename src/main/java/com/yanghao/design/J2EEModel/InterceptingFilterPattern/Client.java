package com.yanghao.design.J2EEModel.InterceptingFilterPattern;

/**
 * @Description：
 * 步骤 6
 * 创建客户端 Client。
 * @Author:yanghao
 * @Date：2018/7/24 17:22
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}