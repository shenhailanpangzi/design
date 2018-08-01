package com.yanghao.design.J2EEModel.InterceptingFilterPattern;

/**
 * @Description：
 * 步骤 5
 * 创建过滤管理器。
 * @Author:yanghao
 * @Date：2018/7/24 17:22
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}