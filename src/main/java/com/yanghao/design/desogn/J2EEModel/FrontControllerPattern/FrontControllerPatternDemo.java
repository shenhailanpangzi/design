package com.yanghao.design.desogn.J2EEModel.FrontControllerPattern;

/**
 * @Description：
 * @Author:yanghao
 * @Date：2018/7/24 16:59
 */
public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
