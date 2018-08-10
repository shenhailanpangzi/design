package com.yanghao.design.desogn.J2EEModel.FrontControllerPattern;

/**
 * @Description：
 * 步骤 3
 * 创建前端控制器 FrontController。
 * @Author:yanghao
 * @Date：2018/7/24 16:58
 */
public class FrontController {

    private Dispatcher dispatcher;

    public FrontController(){
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser(){
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("Page requested: " + request);
    }

    public void dispatchRequest(String request){
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}