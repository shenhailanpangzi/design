package com.yanghao.design.desogn.J2EEModel.InterceptingFilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description：
 * 步骤 4
 * 创建过滤器链。
 * @Author:yanghao
 * @Date：2018/7/24 17:21
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}