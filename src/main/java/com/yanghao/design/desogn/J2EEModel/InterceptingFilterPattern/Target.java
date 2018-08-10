package com.yanghao.design.desogn.J2EEModel.InterceptingFilterPattern;

/**
 * @Description：
 * 步骤 3
 * 创建 Target。
 * @Author:yanghao
 * @Date：2018/7/24 17:21
 */
public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}