package com.yanghao.design.J2EEModel.InterceptingFilterPattern;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 17:22
 */
public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}