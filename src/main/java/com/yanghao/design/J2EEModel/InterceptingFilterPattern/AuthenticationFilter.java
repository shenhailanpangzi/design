package com.yanghao.design.J2EEModel.InterceptingFilterPattern;

/**
 * @Description：
 * 步骤 2
 * 创建实体过滤器
 * @Author:yanghao
 * @Date：2018/7/24 17:20
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request){
        System.out.println("Authenticating request: " + request);
    }
}