package com.yanghao.design.desogn.J2EEModel.InterceptingFilterPattern;

/**
 * @Description：
 * 步骤 1
 * 创建过滤器接口 Filter。
 * @Author:yanghao
 * @Date：2018/7/24 17:20
 */
public interface Filter {
    public void execute(String request);
}